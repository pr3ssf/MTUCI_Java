package Lab.lab78;

import java.net.*;
import java.util.regex.*;

//working with a pair: URL + search depth
public class URLDepthPair {
    public static final String URL_REGEX = "(https?:\\/\\/)((\\w+\\.)+\\.(\\w)+[~:\\S\\/]*)";
    public static final Pattern URL_PATTERN = Pattern.compile(URL_REGEX,  Pattern.CASE_INSENSITIVE);
    private URL URL;
    private int depth;
    
    public URLDepthPair(URL url, int d) throws MalformedURLException {
	    URL = new URL(url.toString());
	    depth = d;
    }
    
    //output of the contents of the pair
    @Override 
    public String toString() {
	    return "URL: " + URL.toString() + ", Depth: " + depth;
    }

    //return URL
    public URL getURL() {
	    return URL;
    }
    
    //return depth of search
    public int getDepth() {
	    return depth;
    } 

    //return host, which is specified in the URL
    public String getHost() {
	    return URL.getHost();
    }
    
    //returning the path of the specified URL
    public String getDocPath() {
	    return URL.getPath();
    }
    
    //checking for an absolute URL
    public static boolean isAbsolute(String url) {
	    Matcher URLChecker = URL_PATTERN.matcher(url);
	    if (!URLChecker.find())
	        return false;
	    return true;
    }
}