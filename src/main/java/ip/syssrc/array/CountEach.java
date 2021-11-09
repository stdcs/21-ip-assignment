package ip.syssrc.array;
import java.util.Scanner;
/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
 *
 */

public class CountEach {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[100000000];
        for (int i = 0; i < n; i++) {
            int var = in.nextInt();
            arr[var]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {

            } else {
                System.out.println(arr[i] + " angka " + i);
            }
        }
        in.close();
    }
}
