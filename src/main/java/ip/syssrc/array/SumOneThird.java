package ip.syssrc.array;
import java.util.Scanner;
/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211061 - St. Alya Ardani Aries <stalyaardaniaries@gmail.com>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int sum;
        int n = in.nextInt();
        int aritmetika = (n/3);
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for(int i = 0; i < n/3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++ ) {
                int deret = i + (j * aritmetika);
                sum = sum + array[deret];
                if (j == 2) {
                    System.out.println(array[deret] + " = " + sum);;
                } else {
                    System.out.print(array[deret] + " + ");
                }
            }
        }

        if (n%3 > 0) {
            sum = 0;
            for (int i = ((n/3) * 3); i < n; i++) {
                sum = sum + array[i];
                if (i == n-1) {
                    System.out.print(array[i] + " = " + sum);
                } else {
                    System.out.print(array[i] + " + ");
                }
            }
        }
        in.close();
    }
}
