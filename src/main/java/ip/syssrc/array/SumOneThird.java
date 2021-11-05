package ip.syssrc.array;
import java.util.Scanner; 
/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int sum;
        int n = in.nextInt();
        int aritmatika = (n/3);
        int[] array = new int[n];
        for (int i=0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }
}
