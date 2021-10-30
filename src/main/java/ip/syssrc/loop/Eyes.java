package ip.syssrc.loop;

import java.util.Scanner;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211045 - MUHAMMAD SOFYAN DAUD PUJAS <gaero38@gmail.com>
 *
 */
public class Eyes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Interface-Input
        int number;
        System.out.println("\nInput : ");
        try { // Filtering input
            number = sc.nextInt();
            sc.close();
            if (number <= 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Mohon masukkan bilangan bulat positif diatas nol!\n");
            return;
        }

        // Form a matrix with a diagonal of number '1' by n x n :
        System.out.println("\nOutput :");

        for (int i = 0; i < number; i++) {
            // The loop length for limit of a number
            for (int t = 0; t < number; t++) { 
                if (t == i) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                if (t == (number - 1)){
                    break;
                }
                System.out.print(" ");
            }
            System.out.printf("\n");
        }
    }
}

// For Practical Programming assignment purpose - Sofyan, 2021