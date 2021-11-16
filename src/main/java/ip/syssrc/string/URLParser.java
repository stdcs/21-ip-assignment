package ip.syssrc.string;

/**
 * URLParser
 *
 * Assignment 5.1
 *
 * @author H071211045 - Muhammad Sofyan Daud Pujas <gaero38@gmail.com>
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
        String[] reserved = { "$", "&", "+", ",", "/", ":", ";", "=", "?", "@", " ", "\"", "<", ">", "#", "%", "{", "}",
                "\\", "^", "~", "[", "]", "`" };
        String[] encoder = { "%24", "%26", "%2B", "%2C", "%2F", "%3A", "%3B", "%3D", "%3F", "%40", "%20", "%22", "%3C",
                "%3E", "%23", "%25", "%7B", "%7D", "%5C", "%5E", "%7E", "%5B", "%5D", "%60" };

        if (!rawURL.contains("%")) {
            for (int i = 0; i < encoder.length; i++) {
                if (rawURL.contains(reserved[i])) {
                    rawURL = rawURL.replaceAll(reserved[i], encoder[i]);
                }
            }
        }

        return rawURL;
    }

    /**
     * Decode percent-encoding URL into raw URL
     *
     * @param encodedURL the percent-encoding URL to be decoded
     * @return string of decoded URL
     */
    public static String decode(String encodedURL) {
        String[] unsafe = { "$", "&", "+", ",", "/", ":", ";", "=", "?", "@", " ", "\"", "<", ">", "#", "%", "{", "}",
                "\\", "^", "~", "[", "]", "`" };
        String[] decoder = { "%24", "%26", "%2B", "%2C", "%2F", "%3A", "%3B", "%3D", "%3F", "%40", "%20", "%22", "%3C",
                "%3E", "%23", "%25", "%7B", "%7D", "%5C", "%5E", "%7E", "%5B", "%5D", "%60" };

        if (!encodedURL.contains("\\") || !encodedURL.contains("/")) {
            for (int i = 0; i < decoder.length; i++) {
                if (encodedURL.toUpperCase().contains(decoder[i])) {
                    encodedURL = encodedURL.toUpperCase().replaceAll(decoder[i], unsafe[i]).toLowerCase();
                }
            }
        }

        return encodedURL;
    }
}
