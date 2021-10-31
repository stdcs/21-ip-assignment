package ip.syssrc.loop;
import java.util.Scanner;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211069 - Muhammad Faiz Fatwa Syarifuddin <faizfatwa030206@gmail.com>
 *
 */

public class MatricesPad {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int start = in.nextInt();
        int end = in.nextInt();
        int size = in.nextInt();

        int range = end - start;
        int temp = start;
        int largest;
        int leadingZero = 0;

        if (start>end) {
            largest = start;
        } else {
            largest = end;
        }
        
        while (largest > 0) {
            largest /= 10;
            leadingZero++;
        }

        if (start >= 0 && end >= 0) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%0" + leadingZero + "d ", temp);
                        temp++;
                    }
                    System.out.printf("%n");
                }
                for (int k = 0; k <= range % size; k++) {
                    System.out.printf("%0" + leadingZero + "d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%0" + leadingZero + "d ", temp);
                        temp--;
                    }
                    System.out.printf("%n");
                }
                for (int k = 0; k <= -range % size; k++) {
                    System.out.printf("%0" + leadingZero + "d ", temp);
                    temp--;
                }
            }
        } 
        in.close();
    }
}
