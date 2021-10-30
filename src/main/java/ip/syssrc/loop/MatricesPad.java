package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211073 - Djulizah Bonita L
 *
 */

import java.util.Scanner;
public class MatricesPad {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);

        int start, end, size, paddingSize;
        

        System.out.print("start : ");
        start = In.nextInt();
        System.out.print("end : ");
        end = In.nextInt();
        System.out.print("size : ");
        size = In.nextInt();

        In.close();

        int range = end - start;
        int temp = start;

        //PaddingDigit
        if (end > start) {
            for (paddingSize = 1; paddingSize <= end; paddingSize++) {
            end = end/10;
            }
        } else {
            for (paddingSize = 1; paddingSize <= start; paddingSize++) {
                start = start/10;
            }
        }
        
        
        if (range >= 0) {
            for (int i = 1; i <= range / size; i++) {
                for (int j = 1; j <= size; j++) {
                    System.out.printf("%0" + paddingSize + "d ", temp);
                    temp++;
                }
                System.out.println("");
            }
            for (int k = 0; k <= range % size; k++) {
                System.out.printf("%0" + paddingSize + "d ", temp);
                temp++;
            }
        } else if (range <= 0) {
            for (int i = 1; i <= -range / size; i++) {
                for (int j = 1; j <= size; j++) {
                    System.out.printf("%0" + paddingSize + "d ", temp);
                    temp--;
                }
                System.out.println("");
            }
            for (int k = 0; k <= -range % size; k++) {
                System.out.printf("%0" + paddingSize + "d ", temp);
                temp--;
            }
        }
    }
}
