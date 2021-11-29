package ip.syssrc.string;

/**
 * FizzBuzz
 *
 * Assignment 5.3
 *
 * @author H071211074 - Wd. Ananda Lesmono <nandalesmono@gmail.com>
 */
public class FizzBuzz {

    /**
     * Format a word into Fizz for each F or f and Buzz for each B or b
     *
     * @param word the word to be converted into FIzzBuzz
     * @return string of the FizzBuzz format of the word or the word it self if
     *         it doesn't contain 'Ff' or 'Bb'
     */
    public static String format(String word) {
        String fChar = word.replace("f", "").replace("F", "");
        int fCount = word.length() - fChar.length();

        String bChar = word.replace("b", "").replace("B", "");
        int bCount = word.length() - bChar.length();

        String fizzBuzz = new String();

        if (fCount == 0 && bCount == 0) {
            fizzBuzz = word;
        }

        for (int i = 1; i <= fCount; i++) {
            fizzBuzz = fizzBuzz.concat("Fizz");
        }

        for (int i = 1; i <= bCount; i++) {
            fizzBuzz = fizzBuzz.concat("Buzz");
        }
        return new String(fizzBuzz);
    }
}
