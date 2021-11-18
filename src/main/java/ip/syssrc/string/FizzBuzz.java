package ip.syssrc.string;

/**
 * FizzBuzz
 *
 * Assignment 5.3
 *
 * @author H071211061 - St. Alya Ardani Aries <stalyaardaniaries@gmail.com>
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
        String charFf = word.replaceAll("f", "").replaceAll("F", "");
        int freqFf = word.length() - charFf.length();

        String charBb = word.replaceAll("b", "").replaceAll("B", "");
        int freqBb = word.length() - charBb.length();

        String fizzBuzz = new String();
        if (freqBb == 0 && freqFf == 0) {
            fizzBuzz = word;
        }
        for (int i = 0; i < freqFf; i++) {
            fizzBuzz = fizzBuzz.concat("Fizz");
        }
        for (int i = 0; i < freqBb; i++) {
            fizzBuzz = fizzBuzz.concat("Buzz");
        }
        return new String();
    }
}
