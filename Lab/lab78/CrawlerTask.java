package Lab.lab78;

import java.io.*;
import java.net.*;
import java.util.regex.*;

//web-scan multiple threads (checking web-pages, adding new links in pool for scanning in multiple threads)
public class CrawlerTask implements Runnable { // two realizations multiple threads (implements, realization of interface Runnable) and examples of class Thread
    public static final String LINK_REGEX = "href\\s*=\\s*\"([^$^\"]*)\"";
    public static final Pattern LINK_PATTERN = Pattern.compile(LINK_REGEX, Pattern.CASE_INSENSITIVE);
    private URLPool pool; 

    public CrawlerTask(URLPool p) {
		pool = p;
    }

    //soket for sending HTTP-request on web-page URLDepthPair
    public Socket sendRequest(URLDepthPair nextPair) 
	throws UnknownHostException, SocketException, IOException { // tell that block can give an exception
		//creating a socket
		Socket socket = new Socket(nextPair.getHost(), 80);
		socket.setSoTimeout(1000);
		
		//resource request from the web page host
		OutputStream out = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(out, true);
		writer.println("GET " + nextPair.getDocPath() + " HTTP/1.1");
		writer.println("Host: " + nextPair.getHost());
		writer.println("Connection: close");
		writer.println(); 

		return socket;
    }

    //a method for processing urls by finding all the links and adding them to the URLPool
    public void processURL(URLDepthPair url) throws IOException { 
		Socket socket;
		try { // the block of the code where may be an exception
	    	socket = sendRequest(url);
		}
		// exceptions
		catch (UnknownHostException e) { // block where exseption is processed
	    	System.err.println("Host "+ url.getHost() + " couldn't be determined"); 
	    	return;
		}
		catch (SocketException e) {
	    	System.err.println("Error with socket connection: " + url.getURL() + 
			       " - " + e.getMessage());
	    	return;
		}
		catch (IOException e) {
	    	System.err.println("Couldn't retrieve page at " + url.getURL() +
			       " - " + e.getMessage());
	    	return;
		}

		InputStream input = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(input)); 
	
		String line;
		//the cycle continues until there are no URLDepth pairs left in the pool
		while ((line = reader.readLine()) != null) { //getting a URL-Depth pair from the pool
	    	Matcher LinkFinder = LINK_PATTERN.matcher(line);//getting a web page by url
	    		while (LinkFinder.find()) { //search for other URLs on the page
					String newURL = LinkFinder.group(1);
					URL newSite;
					try { 
		    			if (URLDepthPair.isAbsolute(newURL))
							newSite = new URL(newURL);
		    			else newSite = new URL(url.getURL(), newURL);
						//adding a new URL-Depth pair to the pool (the depth is 1 more than the previous one)
		    			pool.add(new URLDepthPair(newSite, url.getDepth() + 1));
					}
					catch (MalformedURLException e) {
		    			System.err.println("Error with URL - " + e.getMessage());
					}
	    		}
		}
		reader.close();
		//closing socket
		try {
	    	socket.close();
		}
		catch (IOException e) {
	    	System.err.println("Couldn't close connection to " + url.getHost() +
			       " - " + e.getMessage());
        }
    }
    
    //method for the first URL in the pool
	@Override
    public void run() { // this method transmits to the any constractor of the class Thread
		URLDepthPair nextPair;
		while (true) {
	    	nextPair = pool.get();
	    	try {
				processURL(nextPair);
	    	}
	    	catch (IOException e) {
				System.err.println("Error reading the page at " + nextPair.getURL() +
				   " - " + e.getMessage());
	    	}
		}
    }
}
