package ip.syssrc.array;
import java.util.Scanner;
/**
 * RadixConverter
 *
 * Assignment 3.2
 *
 * @author H071211061 - St. Alya Ardani Aries <stalyaardaniaries@gmail.com>
 *
 */
public class RadixConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = a;
        int c = a;

        int[] twoMultiplier = new int[8];
        int[] eightMultiplier = new int[8];
        int[] sixTeenMultiplier = new int[8];
        int[] base2 = new int[8];
        int[] base8 = new int[8];
        int[] base16 = new int[8];
        int sum;

        // Base 2 //
        for (int i = 0; i < 8; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 2;
            }
            twoMultiplier[i] = sum;
        }

        while (a >= 1) {
            for (int i = 7; i >= 0 ; i--) {
                while (a >= twoMultiplier[i]) {
                    a = a - twoMultiplier[i];
                    base2[7 - i]++;
                }
            }
        }
        System.out.print("Base  2: ");
        for (int i = 0; i < twoMultiplier.length; i++) {
            System.out.print(base2[i]);
        }
        System.out.println();

        // Base 8 // 
        for (int i = 0; i < 8; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 8;
            }
            eightMultiplier[i] = sum;
        }

        while (b >= 1) {
            for (int i = 7; i >= 0 ; i--) {
                while (b >= eightMultiplier[i]) {
                    b = b - eightMultiplier[i];
                    base8[7 - i]++;
                }
            }
        }
        System.out.print("Base  8: ");
        for (int i = 0; i < eightMultiplier.length; i++) {
            System.out.print(base8[i]);
        }
        System.out.println();

        // Base 16 // 
        for (int i = 0; i < 8; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 16;
            }
            sixTeenMultiplier[i] = sum;
        }

        while (c >= 1) {
            for (int i = 7; i >= 0 ; i--) {
                while (c >= sixTeenMultiplier[i]) {
                    c = c - sixTeenMultiplier[i];
                    base16[7 - i]++;
                }
            }
        }
        System.out.print("Base 16: ");
        for (int i = 0; i < 8; i++) {
            if (base16[i] > 9) {
                if (base16[i] == 10) System.out.print("A");
                if (base16[i] == 11) System.out.print("B");
                if (base16[i] == 12) System.out.print("C");
                if (base16[i] == 13) System.out.print("D");
                if (base16[i] == 14) System.out.print("E");
                if (base16[i] == 15) System.out.print("F");
            } else {
                System.out.print(base16[i]);
            }
        }
        in.close();
    }
}
