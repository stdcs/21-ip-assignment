package ip.syssrc.array;

import java.util.Scanner;

/**
 * RadixConverter
 *
 * Assignment 3.2
 *
 * @author H071211045 - MUHAMMAD SOFYAN DAUD PUJAS <gaero38@gmail.com>
 *
 */
public class RadixConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variables
        char[] hexChar = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int[] binary = new int[8];
        int[] octal = new int[8];
        int indexOfBinary = 0;
        int indexOfOctal = 0;
        int indexOfHexa = 0;
        int decimalNumber;
        String hexa = "";

        // Input-Interface
        System.out.print("\nInput (Bilangan Desimal) : ");
        try { // Filtering input
            decimalNumber = sc.nextInt();
            sc.close();
            if (decimalNumber < 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Mohon masukkan bilangan desimal yang valid!\n");
            return;
        }

        // Binary Numbers
        System.out.print("\nBase 2  : ");
        int x = decimalNumber;
        while(x > 0) {  
            binary[indexOfBinary++] = x % 2;    
            x /= 2;
            if (indexOfBinary == binary.length) { // break whenever it's out of bound
                break;
            }
        } 
        for (int t = binary.length - 1; t >= 0; t--) {
            System.out.print(binary[t]);
        }
        System.out.println();

        // Octal Numbers
        int y = decimalNumber;
        while (y != 0) {
            octal[indexOfOctal++] = y % 8;
            y /= 8;
            if (indexOfOctal == binary.length) { // break whenever it's out of bound
                break;
            }
        }
        System.out.print("Base 8  : ");
        for (int t = octal.length - 1; t >= 0; t--) {
            System.out.print(octal[t]);
        }
        System.out.println();

        // Hexa Numbers
        int z = decimalNumber;
        while (z > 0) {
            indexOfHexa = z % 16;
            hexa = hexChar[indexOfHexa] + hexa;
            z /= 16;
        }
        System.out.print("Base 16 : ");
        System.out.print(convert(hexa, '0', 8));
    }
    
    // Making new method to printout only 8-digit pad
    public static String convert(String input, char ch, int L) {
        String result = String.format("%" + L + "s", input).replace(' ', ch);
        return result;
    }
}
