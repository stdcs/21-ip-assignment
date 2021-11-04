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
            Scanner in = new Scanner(System.in);
            System.out.println("Masukkan angka");
            int n = in.nextInt();
            int m = n;
            int o = n;

            in.close();
            
            int[] twoMultiplier = new int[8];
            int[] eightMultiplier = new int[8];
            int[] sixTeenMultiplier = new int[8];
            int[] base2 = new int[8];
            int[] base8 = new int[8];
            int[] base16 = new int[8];
            int sum;
    
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
