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
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Angka");

        int a = in.nextInt();
        int b = a;
        int c = a;
        int[] twoMultiplier = new int[8];
        int[] eightMultiplier = new int[8];
        int[] sixTeenMultiplier = new int[8];
        int[] basis2 = new int[8];
        int[] basis8 = new int[8];
        int[] basis16 = new int[8];
        int sum;

        //Basis 2

        for(int i = 0; i < 8; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 2;
            }
            twoMultiplier[i] = sum;
        }
        while (a >= 1) {
            for(int i = 7; i >= 0; i--) {
                while (a >= twoMultiplier[i]) {
                    a = a - twoMultiplier[i];
                    basis2[7-i]++;
                }
            }
        }
        System.out.print("base  2: ");
        for (int i = 0; i < twoMultiplier.length; i++) {
            System.out.print(basis2[i]);
        }
        System.out.println();

        //Basis 8

        for(int i = 0; i < 8; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 8;
            }
            eightMultiplier[i] = sum;
        }
        while (b >= 1) {
            for(int i = 7; i >= 0; i--) {
                while (b >= eightMultiplier[i]) {
                    b = b - eightMultiplier[i];
                    basis8[7-i]++;
                }
            }
        }
        System.out.print("base  8: ");
        for (int i = 0; i < eightMultiplier.length; i++) {
            System.out.print(basis8[i]);
        }
        System.out.println();

        //Basis 16

        for(int i = 0; i < 8; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 16;
            }
            sixTeenMultiplier[i] = sum;
        }
        while (c >= 1) {
            for(int i = 7; i >= 0; i--) {
                while (c >= sixTeenMultiplier[i]) {
                    c = c - sixTeenMultiplier[i];
                    basis16[7-i]++;
                }
            }
        }
        System.out.print("base 16: ");
        for(int i = 0; i < 8;i++) {
            if (basis16[i] > 9) {
                if (basis16[i] == 10) System.out.print("A"); 
                if (basis16[i] == 11) System.out.print("B"); 
                if (basis16[i] == 12) System.out.print("C"); 
                if (basis16[i] == 13) System.out.print("D"); 
                if (basis16[i] == 14) System.out.print("E"); 
                if (basis16[i] == 15) System.out.print("F"); 
            } else {
                System.out.print(basis16[i]);
            }
        }
        in.close();
    }
}
