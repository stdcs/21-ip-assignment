package ip.syssrc.string;

/**
 * FizzBuzz
 *
 * Assignment 5.3
 *
 * @author H071171512 - Indah Kurnia Ilahi <indahkurnia399@gmail.com>
 */
public class FizzBuzz {
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
      

        return new String(fizzBuzz);
    }
    }

