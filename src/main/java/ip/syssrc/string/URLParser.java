package ip.syssrc.string;

/**
 * URLParser
 *
 * Assignment 5.1
 *
 * @author H071171512 - Indah Kurnia Ilahi <indahkurnia399@gmail.com>
 *
 */
public class URLParser {
     public static String encode(String rawURL) {
        
        String[] symbol = {"$", "&", "+", ",", "/", ":", ";", "=", "?", "@", " ", "\"", "<", ">", "#", "%", "{", "}", "\\", "^", "~", "[", "]", "`"}; 
        String[] URL = {"%24", "%26", "%2b", "%2c", "%2f", "%3a", "%3b", "%3d", "%3f", "%40", "%20", "%22", "%3c", "%3e", "%23", "%25", "%7b", "%7d", "%5c", "%5e", "%7e", "%5b", "%5d", "%60"};
        
        for (int i = 0; i < symbol.length; i++) {
            if (rawURL.contains(symbol[i])) {
                rawURL = rawURL.replaceAll(symbol[i], URL[i]);
            }
        }
        return new String(rawURL);
    }

    
    public static String decode(String encodedURL) {
         String[] symbol = {"%","$", "&", "+", ",", "/", ":", ";", "=", "?", "@", " ", "\"", "<", ">", "#",  "{", "}", "\\", "^", "~", "[", "]", "`"}; 
        String[] URL = {"%24", "%26", "%2b", "%2c", "%2f", "%3a", "%3b", "%3d", "%3f", "%40", "%20", "%22", "%3c", "%3e", "%23", "%25", "%7b", "%7d", "%5c", "%5e", "%7e", "%5b", "%5d", "%60"};
        
        for (int i = 0; i < URL.length; i++) {
            if (encodedURL.contains(URL[i])) {
                encodedURL = encodedURL.replaceAll(URL[i],symbol[i]);
            }
        }
        return new String(encodedURL);
    }
}
