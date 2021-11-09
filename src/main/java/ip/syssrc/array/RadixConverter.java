package ip.syssrc.array;

/**
 * RadixConverter
 *
 * Assignment 3.2
 *
 * @author H071211073 - Djulizah Bonita L
 *
 */
import java.util.Scanner;
public class RadixConverter {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.print("Input number: ");
        int num = In.nextInt();

        //binary converter------------------------------------------------------------------------
        int a = 0;
        int [] bin = new int [8];

        while (num != 0) {
            bin[a] = num%2;
            num = num/2; 
            a++;
        }

        System.out.print("base 2: ");
        for (int i = bin.length-1; i >= 0; i--) {
            System.out.print(bin[i]);
        }
        System.out.println();

        //octal converter-------------------------------------------------------------------------??
        int b = 0;
        int [] oct = new int [8];

        while (num != 0) {
            oct[b] = num%8;
            num = num/8; 
            b++;
        }

        System.out.print("base 8: ");
        for (int j = bin.length-1; j >= 0; j--) {
            System.out.print(oct[j]);
        }
        System.out.println();

        //hexa converter--------------------------------------------------------------------------
        int sum;
        int[] sixTeenMultiplier = new int[8];
        int[] base16 = new int[8];

        for(int i = 0; i < 8; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 16;
            }
            sixTeenMultiplier[i] = sum;
        }

        while (num >= 1) {
            for(int i = 7; i >= 0; i--) {
                while (num >= sixTeenMultiplier[i]) {
                    num = num-sixTeenMultiplier[i];
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

        In.close();
    }
}
