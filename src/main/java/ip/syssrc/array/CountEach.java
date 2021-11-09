package ip.syssrc.array;
import java.util.Scanner;
/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211061 - St. Alya Ardani Aries <stalyaardaniaries@gmail.com>
 *
 */

public class CountEach {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int n;
        n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int[] fr = new int[array.length];
        int visited = -1;

        for (int i = 0; i < array.length; i++) {
            int count = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    fr[j] = visited;
                }
            }

            if (fr[i] != visited) {
                fr[i] = count;
            }
            
            if(fr[i] != visited) {
                System.out.println(fr[i] + " Angka " + array[i]);
            }
        }
        in.close();
    }
}