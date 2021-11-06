package ip.syssrc.array;

import java.util.Scanner;

/**
 * RadixConverter
 *
 * Assignment 3.2
 *
 * @author H071211059 - Muhammad Erwin Arif <muherwinarif31@gmail.com>
 *
 */
public class RadixConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int[] arr;
        int[] divider = { 2, 8, 16 };

        n = scan.nextInt();

        for (int i = 0; i < divider.length; i++) {
            arr = new int[8];
            int decimal = n;
            System.out.printf("base %2d: ", divider[i]);

            for (int j = (arr.length - 1); decimal > 0; j--) {
                int modulo = (decimal % divider[i]);
                arr[j] = (modulo > 9) ? (modulo + 55) : modulo;
                decimal /= divider[i];
            }

            for (int c : arr) {
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
