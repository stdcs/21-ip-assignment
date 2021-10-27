package ip.syssrc.loop;

import java.util.Scanner;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211045 - MUHAMMAD SOFYAN DAUD PUJAS <gaeor83@gmail.com>
 *
 */

public class MatricesPad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end, size;

        // Input-Interface :
        System.out.println("\nInput :");
        try {
            start = sc.nextInt();
            end = sc.nextInt();
            size = sc.nextInt();
            sc.close();
            
            // Filtering input
            if (start < 0 || end < 0 || size < 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Mohon masukkan bilangan bulat positif diatas nol!\n");
            return;
        }

        // Pre-statements :
        int length = (start > end) ? start : end;
        int d = 0;

        // Digit of zero(s) calculation inside the range :
        while (length != 0) {
            length /= 10;
            ++d;
        }

        // Output Result :
        System.out.println("\nResult :");
        for (int i = start; (start < end ? i <= end : i >= end); ) {
            
            // Line output by selections
            if ((i != start) && ((i - start) % size == 0 || (start - i) % size == 0)) {
                System.out.println(" ");
            }

            // Numbers output
            System.out.printf("%0" + d + "d ", i);

            // Increment by condition 
            if (start > end) {
                --i;
            } else {
                ++i;
            }
        }
        System.out.println("\n");
    }
}

// For Practical Programming assignment purpose - Sofyan, 2021