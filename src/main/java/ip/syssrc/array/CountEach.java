package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211074 - Wd. Ananda Lesmono <nandalesmono@gmail.com>
 *
 */
import java.util.Scanner;
public class CountEach {

    public static void main(String[] args) {
        Scanner dede = new Scanner(System.in);
        int n = dede.nextInt();
        int[] array = new int[10000000];
        for (int i = 0; i < n; i++) {
            int var = in.nextInt();
            array[var]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println(array[i] + " angka " + i);
            }
        }
    }
}
