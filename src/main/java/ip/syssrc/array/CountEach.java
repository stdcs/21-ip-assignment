package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211084 - Suhastina <Suhastina88@gmail.com>
 *
 */
import java.util.Scanner;
public class CountEach {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[10000000];
        for (int i = 0; i < n; i++){
            int var = in.nextInt();
            array[var]++;
             
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){

            } else {
                System.out.println(array[i] + " angka " + i); 
            }
        }
        in.close();
    }
}
