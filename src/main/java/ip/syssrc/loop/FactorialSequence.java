package ip.syssrc.loop;

import java.util.Scanner;

/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211045 - MUHAMMAD SOFYAN DAUD PUJAS <gaero38@gmail.com>
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input-Interface :
        int number;
        System.out.println("\nInput :");
        try { // Filtering Input
            number = sc.nextInt();
            sc.close();
            
            if (number < 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Mohon masukkan bilangan bulat positif diatas nol!\n");
            return;
        }

        // Result :
        int sum = 1;
        System.out.printf("%d!", number);
        if (number != 0) {
            // Print lines of factorial numbers by looping for
            for (int i = number; i >= 1; i--) {
                sum = sum * i;
                if (i == number) {
                    System.out.print(" = " + i);
                } else {
                    System.out.print(" x " + i);
                }
            }
        } else { // The condition if our input is 0
            sum = 1;
        }
        System.out.print(" = " + sum);
    }
    
}

// For Practical Programming assignment purpose - Sofyan, 2021