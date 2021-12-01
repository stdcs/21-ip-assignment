package ip.syssrc.string;

/**
 * URLParser
 *
 * Assignment 5.1
 *
 * @author H071211087 - Syarif Hidayat <syarifdayat119@gmail.com>
 *
 */
public class URLParser {

    /**
     * Encode rawURL into percent-encoding format
     *
     * @param rawURL the URL to be encoded
     * @return string of encoded URL
     */
    public static String encode(String rawURL) {

        //Symbol dan URL
        String[] symbol = {"$", "&", "+", ",", "/", ":", ";", "=", "?", "@", " ", "\"", "<", ">", "#", "%", "{", "}", "\\", "^", "~", "[", "]", "`"}; 
        String[] URL = {"%24", "%26", "%2b", "%2c", "%2f", "%3a", "%3b", "%3d", "%3f", "%40", "%20", "%22", "%3c", "%3e", "%23", "%25", "%7b", "%7d", "%5c", "%5e", "%7e", "%5b", "%5d", "%60"};

        //Perulangan
        for(int i = 0; i<symbol.length; i++){
            if (rawURL.contains(symbol[i])){
                rawURL = rawURL.replaceAll(symbol[i], URL[i]);
            }
        }
        return new String(rawURL);
    }

    /**
     * Decode percent-encoding URL into raw URL
     *
     * @param encodedURL the percent-encoding URL to be decoded
     * @return string of decoded URL
     */
    public static String decode(String encodedURL) {
        
        //Symbol dan URL
        String[] symbol = {"%","$", "&", "+", ",", "/", ":", ";", "=", "?", "@", " ", "\"", "<", ">", "#",  "{", "}", "\\", "^", "~", "[", "]", "`"}; 
        String[] URL = {"%24", "%26", "%2b", "%2c", "%2f", "%3a", "%3b", "%3d", "%3f", "%40", "%20", "%22", "%3c", "%3e", "%23", "%25", "%7b", "%7d", "%5c", "%5e", "%7e", "%5b", "%5d", "%60"};

        //Perulangan
        for(int i = 0; i<URL.length; i++){
            if(encodedURL.contains(URL[i])){
                encodedURL = encodedURL.replaceAll(URL[i],symbol[i]);
            }
        }
        return new String(encodedURL);
    }
}
