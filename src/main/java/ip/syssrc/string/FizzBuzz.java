package ip.syssrc.string;

/**
 * FizzBuzz
 *
 * Assignment 5.3
 *
 * @author H071211045 - Muhammad Sofyan Daud Pujas <gaero38@gmail.com>
 */
public class FizzBuzz {

    /**
     * Format a word into Fizz for each F or f and Buzz for each B or b
     *
     * @param word the word to be converted into FIzzBuzz
     * @return string of the FizzBuzz format of the word or the word it self if it
     *         doesn't contain 'Ff' or 'Bb'
     */
    public static String format(String word) {
        int fizzCount = word.length() - word.toLowerCase().replace("f", "").length();
        int buzzCount = word.length() - word.toLowerCase().replace("b", "").length();
        String converted = "";
        Boolean convert = true;

        if (fizzCount <= 0 && buzzCount <= 0) {
            convert = false;
            converted = word;
        }

        for (int i = 0; i < fizzCount; i++) {
            if (!convert) {
                break;
            }
            converted = converted.concat("Fizz");
        }
        for (int i = 0; i < buzzCount; i++) {
            if (!convert) {
                break;
            }
            converted = converted.concat("Buzz");
        }

        return converted;
    }
}
