package ip.syssrc.string;

/**
 * URLParser
 *
 * Assignment 5.1
 *
 * @author H071211041 - Fathur Rachman Alamsyah <sembarangm135@gmail.com>
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
        String[] kara = {"$","&","+",",","/",":",";","=","?","@"," ","\"","<",">","#","%","{","}","\\","^","~","[","]","`"};
        String[] urlencode = {"%24","%26","%2b","%2c","%2f","&3a","%3b","%3d","%3f","%40","%20","%22","%3c","%3e","%23","%25","%7b","%7d","%5c","%5e","%7e","%5b","%5d","60"}

        for (int i = 0;i<kara.length;i++){
            if (rawURL.contains(kara[i])) {
                rawURL = rawURL.replaceAll(kara[i],urlencode[i]);
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
        String[] kara = {"%","$","&","+",",","/",":",";","=","?","@"," ","\"","<",">","#","{","}","\\","^","~","[","]","`"};
        String[] urlencode = {"%25","%24","%26","%2b","%2c","%2f","&3a","%3b","%3d","%3f","%40","%20","%22","%3c","%3e","%23","%7b","%7d","%5c","%5e","%7e","%5b","%5d","60"}

        for (int i = 0;i<urlencode.length;i++){
            if (encodedURL.contains(urlencode[i])) {
                encodedURL = encodedURL.replaceAll(urlencode[i],kara[i]);
            }
        }
        return new String(encodedURL);
    }
}
