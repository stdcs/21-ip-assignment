package ip.syssrc.array;
<<<<<<< HEAD
import java.util.Scanner;
=======

>>>>>>> d53c340 (feat(array): add assignment 3 placeholder files)
/**
 * RadixConverter
 *
 * Assignment 3.2
 *
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 08a8b6c (feat(array):add Assignment3)
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
=======
 * @author H071211051 - Febi Fiantika  <febifian23@gmail.com>
>>>>>>> 7ccbec8 (feat(array):add Assignment3)
<<<<<<< HEAD
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> d53c340 (feat(array): add assignment 3 placeholder files)
=======
>>>>>>> 08a8b6c (feat(array):add Assignment3)
 *
 */
public class RadixConverter {

    public static void main(String[] args) {
<<<<<<< HEAD
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

        //---------------------------------------------------Base 8--------------------------------------------------------------------------//

        for(int i = 0; i < 8; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 8;
            }
            eightMultiplier[i] = sum;
        }


        
        while (m >= 1) {
            for(int i = 7; i >= 0; i--) {
                while (m >= eightMultiplier[i]) {
                    m = m - eightMultiplier[i];
                    base8[7-i]++;
                }
            }
        }
        System.out.print("Base 8: ");
        for (int i = 0; i < eightMultiplier.length; i++) {
            System.out.print(base8[i]);
        }
        System.out.println();

        //---------------------------------------------------Base 16-------------------------------------------------------------------------//

        for(int i = 0; i < 8; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 16;
            }
            sixTeenMultiplier[i] = sum;
        }

        while (o >= 1) {
            for(int i = 7; i >= 0; i--) {
                while (o >= sixTeenMultiplier[i]) {
                    o = o-sixTeenMultiplier[i];
                    base16[7-i]++;
                }
            }
        }
        System.out.print("Base 16: ");
        for(int i = 0; i < 8;i++) {
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
=======

>>>>>>> d53c340 (feat(array): add assignment 3 placeholder files)
    }
}
