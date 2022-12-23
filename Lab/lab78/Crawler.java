package Lab.lab78;

import java.net.*;

//creating multiple threads to process URLs with the root at the specified URL
public class Crawler {
    private URLPool pool;
    
    public int countThreads = 16; //num of threads
	//enabling the protocol in the root URL (simplifying the verification of visited URLs)
    public Crawler(String root, int max) throws MalformedURLException {
		pool = new URLPool(max);
		URL rootURL = new URL(root);
		pool.add(new URLDepthPair(rootURL, 0));
    }

    //creating threads CrawlerTask for processing URL
    public void crawl() {
		for (int i = 0; i < countThreads; i++) {
	    	CrawlerTask crawler = new CrawlerTask(pool);
	    	Thread thread = new Thread(crawler);
	    	thread.start();
		}
		//while URL "isWaiting", processing crawl()
		while (pool.getWaitCount() != countThreads) {
	    	try {
				Thread.sleep(500);
	    	}
			//terminating process if num of all threads equal num of threads processing by each method
			
	    	catch (InterruptedException e) {
				System.out.println("Ignoring unexpected InterruptedException - " +
				   e.getMessage());
	    	}
		}
		pool.printURLs();
    }

    //starting the crawler which scan each URL from base
    public static void main(String[] args) {
		// alert user about his syntax error
		if (args.length != 2) {
	    	System.err.println("Usage: java Crawler <URL> <depth>");
	    	System.exit(1);
		}
		//creating example of class Crawler and calling method crawl()
		try { 
	    	Crawler crawler = new Crawler(args[0], Integer.parseInt(args[1]));
	    	crawler.crawl();
		}
		catch (MalformedURLException e) {
	    	System.err.println("Error: The URL " + args[0] + " is not valid");
	    	System.exit(1);
		}
		System.exit(0);
    }
}