package ip.syssrc.array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211045 - MUHAMMAD SOFYAN DAUD PUJAS <gaero38@gmail.com>
 *
 */
public class CountEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] occurence;
        int[] index;
        int size;

        // Interface-Input
        System.out.print("\nMasukkan banyaknya angka\nyang Ingin di-input : ");
        try { // Filtering input
            size = sc.nextInt();
            index = new int[size];
            System.out.print("\nMasukkan angka yang dimaksud (" + size + "): ");
            for (int i = 0; i < size; i++) {
                index[i] = sc.nextInt();
            }
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Mohon masukkan angka!\n");
            return;
        }

        // Intialize pre-statements
        occurence = new int[size];
        int fit = -1;
        int opt = 1;

        // Find the exact same numbers
        for (int i = 0; i < size - 1; i++) {
            for (int t = i + 1; t < size; t++) {
                if (index[i] == index[t] && i != t) {
                    occurence[t] = fit;
                    ++opt;
                }
            }
            if (occurence[i] != fit) {
                occurence[i] = opt;
            }
            opt = 1;
        }

        // Prints the result
        System.out.println("Terdapat : ");
        for (int i = 0; i < size; i++) {
            if (occurence[i] != fit) {
                System.out.print(occurence[i] + " Angka " + index[i] + "\n");
            }
        }
             
        
        
    }
}
