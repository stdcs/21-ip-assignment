package ip.syssrc.function;

/**
 * Vigesimal
 *
 * Assignment 4.1
 *
 * @author H071211087 - Syarif Hidayat <syarifdayat119@gmail.com>
 */
public class Vigesimal {
    public static void main(Strig[] args) {
        table();
    }

    /**
     * Convert a radix-10 (decimal) number into radix-20 (vigesimal) number
     *
     * @param n the radix-10 number to be converted
     * @return array of char that represent the radix-20 format
     */
    //01
    public static char[] toVigesimal(int n) {
        int length = (n >= 20) ? 2 : 1;
        char[] arr = new char[length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int modulo = (n % 20);
            arr[i] = (modulo > 9) ? (char) (modulo + 55) : (char) (modulo + '0');
            n /= 20;
        }
        return arr;
    }

    /**
     * Print the vigesimal multiplication table
     *
     * @return void
     */
    //02
    public static void table() {
        for (int i = 1; i <  20; i++) {
            for (int j = 1; j < 20; j++) {
                char[] arr = toVigesimal((i * j));
                System.out.printf("%s", (j != 1) ? "\t" : "");

                for (char c : arr) {
                    System.out.printf("%s", c);
                }
            }
            System.out.printf("\n");
        }
    }
}
