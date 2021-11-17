package ip.syssrc.string;

/**
 * FizzBuzz
 *
 * Assignment 5.3
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
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
        String fWord;
        fWord = word.replace("F", "");
        fWord = word.replace("f", "");
        int fCount;
        fCount = word.length() - fWord.length();
        String bWord;
        bWord = word.replace("B", "");
        bWord = word.replace("b", "");
        int bCount;
        bCount = word.length() = bWord.length();

        String fizzBuzz = new String();

        int i = 1;
        if (fCount == 0 && bCount == 0){
            fizzBuzz = word;
        }
        while (i <= fCount){
            fizzBuzz = fizzBuzz.concat ("Fizz");
            i++;
        }
        while (i <= bCount){
            fizzBuzz = fizzBuzz.concat ("Buzz");
        }
        return new String(fizzBuzz);
    }
}
