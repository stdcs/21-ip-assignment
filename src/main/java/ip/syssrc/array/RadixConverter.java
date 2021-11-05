package ip.syssrc.array;
import java.util.Scanner;
/**
 * RadixConverter
 *
 * Assignment 3.2
 *
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
 *
 */
public class RadixConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        int o = n;
        int [] twoMultiplier = new int[8];
        int [] eightMultiplier = new int[8];
        int [] sixteenMultiplier = new int[8];
        int[] base2 = new int[8];
        int[] base8 = new int[8];
        int[] base16 = new int[8];
        int sum; 

        // Base 2 
        for (int i = 0; i < 8; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 2;
            }
            twoMultiplier[i] = sum;
        }

        while (n >= 1 ) {
            for (int i = 7; i >= 0; i++) {
                while (n >= twoMultiplier[i]) {
                    n = n - twoMultiplier[i];
                    base2[7-i]++;
                }
            }
        } 
        System.out.println("Base 2: ");
        for (int i = 0; i < twoMultiplier.length; i++) {
            System.out.println(base2[i]);
        }
        System.out.println();
    }
}
