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

        for (int index = 0; index < (arr.length / 3); index++) {
            // Your magic is here
        }
    }
}
