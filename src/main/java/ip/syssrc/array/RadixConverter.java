package ip.syssrc.array;

/**
 * RadixConverter
 *
 * Assignment 3.2
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
import java.util.Scanner;

public class RadixConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array;
        int[] divider = { 2, 8, 16 };

        try {
            n = sc.nextInt();
            sc.close();
            if (n < 0 && n > 255) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Masukkan input >= 0!");
            return;
        }
        for (int i = 0; i < divider.length; i++) {
            array = new int[8];
            int decimal = n;
            System.out.printf("base %2d: ", divider[i]);

            for (int j = (array.length - 1); decimal > 0; j--) {
                int modulo = (decimal % divider[i]);
                array[j] = (modulo > 9) ? (modulo + 55) : modulo;
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