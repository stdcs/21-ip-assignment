package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211066 - Syifa Ur Rahmi <sifasisi3@gmail.com>
 *
 */
import java.util.Scanner;
public class SumOneThird {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        for (int index = 0; index < (arr.length / 3); index++) {
            int n = (arr.length / 3);
            for (int j = 0; j < 1; j++ ){
                System.out.println(arr[i] + " + " + (arr[i] + n) + " + " + (arr[i] + (2*n)) + " = " + (arr[i] + (arr[i] + n)+ (arr[i] + (2*n))));
            }
        }
        in.close();
    }
}
