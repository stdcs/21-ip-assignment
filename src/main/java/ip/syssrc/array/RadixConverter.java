package ip.syssrc.array;
import java.util.Scanner; 
/**
 * RadixConverter
 *
 * Assignment 3.2
 *
 * @author H071211079 - Dhiyaa Unnisa <unnisadhiyaa25@gmail.com>
 *
 */
public class RadixConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka");
        int n = in.nextInt();
        int m = n;
        int o = n;
        int[] twoMultiplier = new int[8];
        int[] eightMultiplier = new int[8];
        int[] sixTeenMultiplier = new int[8];
        int[] base2 = new int[8];
        int[] base8 = new int[8];
        int[] base16 = new int[8];
        int sum;

        //---------------------------------------------------Base 2--------------------------------------------------------------------------//

        for(int i = 0; i < 8; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 2;
            }
            twoMultiplier[i] = sum;
        }
        

        while (n >= 1) {
            for(int i = 7; i >= 0; i--) {
                while (n >= twoMultiplier[i]) {
                    n = n-twoMultiplier[i];
                    base2[7-i]++;
                }
            }
        }
        System.out.print("Base 2: ");
        for (int i = 0; i < twoMultiplier.length; i++) {
            System.out.print(base2[i]);
        }
        System.out.println();
    }
}
