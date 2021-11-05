package ip.syssrc.array;
import java.util.Scanner; 
/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211079 - Dhiyaa Unnisa <unnisadhiyaa25@gmail.com>
 *
 */

public class CountEach {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();
        int[] array = new int[10000000];

        for (int i = 0; i < array.length; i++) {
            int var = in.nextInt();
            array[var]++;
        }
    }
}
