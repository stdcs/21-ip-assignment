package ip.syssrc.array;
import java.util.Scanner;
/**
 * RadixConverter
 *
 * Assignment 3.2
 *
 * @author H071211068 - Michael Gabriel Bida <michaelgabriel663@gmail.com>
 *
 */
public class RadixConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;
        int[] array;
        int[] divider = { 2, 8, 16 };

        n = scan.nextInt();
        scan.close();

        for (int i = 0; i < divider.length; i++) {
            array = new int[8];
            int decimal = n;
            System.out.printf("base %2d: ", divider[i]);

            for (int j = (array.length - 1); decimal > 0; j--) {
                int mod = (decimal % divider[i]);
                array[j] = (mod > 9) ? (mod + 55) : mod;
                decimal /= divider[i];
            }

        Scanner scan = new Scanner(System.in);

        int n;
        int[] array;
        int[] divider = { 2, 8, 16 };

        n = scan.nextInt();
        scan.close();

        for (int i = 0; i < divider.length; i++) {
            array = new int[8];
            int decimal = n;
            System.out.printf("base %2d: ", divider[i]);

            for (int j = (array.length - 1); decimal > 0; j--) {
                int mod = (decimal % divider[i]);
                array[j] = (mod > 9) ? (mod + 55) : mod;
                decimal /= divider[i];
            }

            for (int c : array) {
                if (c > 9) {
                    System.out.printf("%c", (char) c);
                } else {
                    System.out.printf("%d", c);
                }
            }
            System.out.printf("%s", (i != divider.length - 1) ? "\n" : "");
        }
    }
}     
