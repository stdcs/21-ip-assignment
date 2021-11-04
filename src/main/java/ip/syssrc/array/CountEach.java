package ip.syssrc.array;
import java.util.Scanner;
/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211060 - Andi Muh. Ibnu Hibban Bagoes Malolo <andibagoes1412@gmail.com>
 *
 */

public class CountEach {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] array = new int[10000000];
        
        for (int i = 0 ; i < N ; i++) {
            int var = obj.nextInt();
            array[var]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {

            } else {
                System.out.println(array[i] + " angka " + i);
            }
        }
        obj.close();
    }
}
