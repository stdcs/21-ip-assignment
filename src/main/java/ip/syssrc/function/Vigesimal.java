package ip.syssrc.function;

/**
 * Vigesimal
 *
 * Assignment 4.1
 *
 * @author H071211045 - MUHAMMAD SOFYAND DAUD PUJAS <gaero38@gmail.com>
 */
public class Vigesimal {

    /**
     * Convert a radix-10 (decimal) number into radix-20 (vigesimal) number
     *
     * @param n the radix-10 number to be converted
     * @return array of char that represent the radix-20 format
     */
    public static char[] toVigesimal(int n) {
        char[] vigesimalChar = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J'};
        int charIndex = 0;
        int size = (n < 20) ? 1 : 2;
        int vigesimalIndex = charIndex;
        char[] vigesimal = new char[size];

        while (n > 0) { // Forms vigesimal array with converted base-20
            charIndex = n % 20;
            vigesimal[vigesimalIndex++] = vigesimalChar[charIndex];
            n /= 20;
        }

        char[] converted = new char[size];
        for (int i = 0, t = vigesimal.length - 1; t >= 0; t--) { // Reverse the array
            converted[i++] = vigesimal[t];
        }
        return converted;
    }

    /**
     * Print the vigesimal multiplication table
     *
     * @return void
     */
    public static void table() {
        for (int i = 1; i <= 19; i++) {
            for (int t = 1; t <= 19; t++) {
                char[] result = toVigesimal(i * t);
                System.out.printf("%s", (t == 1) ? "" : "\t");
                for (char x : result) {
                    System.out.printf("%s", x);
                }
            }
            System.out.println();
        }
    }
}
