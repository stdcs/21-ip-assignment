package ip.syssrc.array;
import java.util.Scanner;
/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211068 - Michael Gabriel Bida <michaelgabriel663@gmail.com>
 *
 */

public class CountEach {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[10000000];

        for (int i = 0; i < n; i++) {
            int var = in.nextInt();
            array[var]++;
        }

        in.close();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
            } else {
                System.out.println(array[i] + " angka " + i);
            }
        }
    }
}