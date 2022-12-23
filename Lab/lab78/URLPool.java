package Lab.lab78;

import java.util.*;

//storing a list of search URLs and search depth
public class URLPool {
    private int maxDepth;
    private int waitCount = 0; //number of current threads in the wait() method
    private LinkedList<URLDepthPair> rawURLs; //unprocessed URLs
    private LinkedList<URLDepthPair> processedURLs; //processed URLs
    private HashSet<String> scanURLs; //unique scanned
    
	//URLPool with the maximum specified depth
    public URLPool(int max) {
		rawURLs = new LinkedList<URLDepthPair>();
		processedURLs = new LinkedList<URLDepthPair>();
		scanURLs = new HashSet<String>();
		maxDepth = max;
    }
	
    //returning the number of pending threads
	public synchronized int getWaitCount() {
		return waitCount;
    }

	//adding a URLDepthPair pair to the corresponding list
    public synchronized void add(URLDepthPair nextPair) {
		String newURL = nextPair.getURL().toString();
		String modifyURL = (newURL.endsWith("/")) ? newURL.substring(0, newURL.length() -1) : newURL;
		if (scanURLs.contains(modifyURL))
	    	return;
		scanURLs.add(modifyURL);
	
		if (nextPair.getDepth() < maxDepth) {
	    	rawURLs.add(nextPair);
	    	notify(); //notify when a new URL is added to the pool
		}
		processedURLs.add(nextPair);
    }

	// inc dec waitmode
    public synchronized URLDepthPair get() {
		//waiting in case no url is currently available
		while (rawURLs.size() == 0) {
	    	waitCount++; //increases immediately before calling wait()
	    	try {
				wait();
	    	}
	    	catch (InterruptedException e) {
				System.out.println("Ignoring unexpected InterruptedException - " + 
				   e.getMessage());
	    	}
	    	waitCount--; //decreases immediately after exiting standby mode
		}
		return rawURLs.removeFirst();
    }

    //displaying all processed URLs
    public synchronized void printURLs() {
		System.out.println("\nUnique URLs Found: " + processedURLs.size());
		while (!processedURLs.isEmpty()) {
	    	System.out.println(processedURLs.removeFirst());
		}
    }
}