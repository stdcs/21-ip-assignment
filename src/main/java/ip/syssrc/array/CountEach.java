package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211041 - Fathur Rachman Alamsyah <sembarangm135@gmail.com>
 *
 */
import java.util.Scanner;

public class CountEach {

    public static void main(String[] args) {

        Scanner t3 = new Scanner(System.in);
        int n = t3.nextInt();
        int[] array = new int[10000000];
        for (int i = 0; i < n; i++) {
            int var = t3.nextInt();
            array[var]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {

            } else {
                System.out.println(array[i] + " angka " + i);
            }
        }
        t3.close();
    }
}
