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
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

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
                a = a - twoMultiplier[i];
                base2[7 - i]++;
            }
        }
        System.out.print("Base  2: ");
        for (int i = 0; i < twoMultiplier.length; i++) {
            System.out.print(base2[i]);
        }
        System.out.println();
        
    }
}
