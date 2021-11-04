package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
import java.util.Scanner;
public class SumOneThird {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        for (int index = 0; index < (arr.length / 3); index++) {
            int sum = 0;
            sum += arr[i];
        }
        for(int i = 0; i < arr.length / 3; i++) {
            for (int j = 0; j < 3; j++ ) {
                int deret = i + (j * (arr.length / 3));
                sum = sum + arr[deret];
                if (j == 2) {
                    System.out.println(arr[deret] + " = " + sum);;
                } else {
                    System.out.print(arr[deret] + " + ");
                }
            }
        }
        if (arr.length%3 > 0) {
            sum = 0;
            for (int i = ((arr.length/3) * 3); i < arr.length; i++) {
                sum = sum + arr[i];
                if (i == arr.length-1) {
                    System.out.print(arr[i] + " = " + sum);
                } else {
                    System.out.print(arr[i] + " + ");
                }
            }
        }
        in.close();
    }
}
