package ip.syssrc.function;

/**
 * Vigesimal
 *
 * Assignment 4.1
 *
 * @author H071211069 - Muhammad Faiz Fatwa Syarifuddin <faizfatwa030206@gmail.com>
 */
public class Vigesimal {

    /**
     * Convert a radix-10 (decimal) number into radix-20 (vigesimal) number
     *
     * @param n the radix-10 number to be converted
     * @return array of char that represent the radix-20 format
     */
    public static char[] toVigesimal(int n) {
      
        int length = 0;
        int decimal = n;
        char[] vigechars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J' };

        while (n > 0) {
            n /= 20;
            length++;
        }

        char[] arr = new char[length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int modulo = (decimal % 20);
            decimal /= 20;
            arr[i] = vigechars[modulo];
        }
        return arr;
    }    

    /**
     * Print the vigesimal multiplication table
     *
     * @return void
     */
    public static void table() {
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                char[] arr = toVigesimal((i * j));
    
                /** Print Char Array */
                for (char c : arr) {
                    System.out.printf("%c", c);
                }
                System.out.printf("\t")
            }   
            System.out.printf("\n");
        }    
    }
}
