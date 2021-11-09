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
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = dede.nextInt();
        }

        int[] freq = new int[array.length];
        int included = -1;

        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < array.length; j++) {
               if (array[i] == array[j]) {
                   counter++;
                   freq[j] = included;
               }
            }
            if (freq[i] != included) {
                freq[i] = counter;
            }
            if (freq[i] != included) {
                System.out.println(freq[i] + " angka " + array[i]);
            }
        }
    }
}
