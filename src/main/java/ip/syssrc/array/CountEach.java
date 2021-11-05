package ip.syssrc.array;
import java.util.Scanner;
/**
 * CountEach
 *
 * Assignment 3.1
 *
<<<<<<< HEAD
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
=======
 * @author H071211051 - Febi Fiantika  <febifian23@gmail.com>
>>>>>>> 7ccbec8 (feat(array):add Assignment3)
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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {

            } else {
                System.out.println(array[i] + " angka " + i);
            }
        }
        in.close();
    }
}
