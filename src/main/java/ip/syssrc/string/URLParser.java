package ip.syssrc.string;

/**
 * URLParser
 *
 * Assignment 5.1
 *
 * @author H071211084 - Suhastina <Suhastina88@gmail.com>
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
        String[] character = {"%", "$", "&", "+", ",", "/", ":", ";", "=", "?", "@", " ", "\"", "<",
                ">", "#", "{", "}", "\\", "^", "~", "[", "]", "`"};
        String[] hex = {"%25", "%24", "%26", "%2B", "%2C", "%2F", "%3A", "%3B", "%3D", "%3F", "%40",
                "%20", "%22", "%3C", "%3E", "%23", "%7B", "%7D", "%5C", "%5E", "%7E", "%5B", "%5D",
                "%60"};

        for (int i = 0; i < character.length; i++) {
            if (rawURL.contains(character[i])) {
                rawURL = rawURL.replaceAll(character[i], hex[i]);
            }
        }//st
        return new String(rawURL);
    }

    /**
     * Decode percent-encoding URL into raw URL
     *
     * @param encodedURL the percent-encoding URL to be decoded
     * @return string of decoded URL 
     * 
     */
    public static String decode(String encodedURL) {
        String[] character = {"%", "$", "&", "+", ",", "/", ":", ";", "=", "?", "@", " ", "\"", "<",
                ">", "#", "{", "}", "\\", "^", "~", "[", "]", "`"};
        String[] hex = {"%25", "%24", "%26", "%2B", "%2C", "%2F", "%3A", "%3B", "%3D", "%3F", "%40",
                "%20", "%22", "%3C", "%3E", "%23", "%7B", "%7D", "%5C", "%5E", "%7E", "%5B", "%5D",
                "%60"};

        for (int i = 0; i < character.length; i++) {
            if (encodedURL.contains(hex[i])) {
                encodedURL = encodedURL.replaceAll(hex[i], character[i]);
            }
        }
        return new String(encodedURL);
    }
}