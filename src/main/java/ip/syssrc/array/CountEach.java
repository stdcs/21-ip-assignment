package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211052 - Muhammad Arya Ramdani <mhmdaryaramdani@gmail.com>
 *
 */

public class CountEach {

    public static void main(String[] args) {
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