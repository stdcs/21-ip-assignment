package ip.syssrc.string;

/**
 * FizzBuzz
 *
 * Assignment 5.3
 *
<<<<<<< HEAD
 * @author H071211070 - Firmansyah <frmnsyah33@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 301f65a7c016f2cf0816854edea50df832a6bce7
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
<<<<<<< HEAD
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
=======
>>>>>>> 301f65a7c016f2cf0816854edea50df832a6bce7
        return new String();
    }
}
