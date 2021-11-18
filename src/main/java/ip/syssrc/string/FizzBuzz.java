package ip.syssrc.string;

/**
 * FizzBuzz
 *
 * Assignment 5.3
 *
 * @author H071211041 - Fathur Rachman Alamsyah <sembarangm135@gmail.com>
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

        String charf = word.replace("F","").replace("f","");
        int countf = word.length() - charf.length();

        String charb = word.replace("B","").replace("b","");
        int countb = word.length() - charb.length();

        String fizzBuzz - new String();

        if(countf == 0 && countb == 0){
            fizzBuzz = word;
        }
        for(int i = 1; i <= countf; i++) {
            fizzBuzz = fizzBuuzz.concat("Fizz");
        }
        for(int i = 1; i <= countb; i++) {
            fizzBuzz = fizzBuuzz.concat("Buzz");
        }

        return new String(fizzBuzz);
    }
}
