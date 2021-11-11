package ip.syssrc.array;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211087 - Syarif Hidayat <syarifdayat119@gmail.com>
 *
 */
public class CountEach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int[] array;
        int [] frequency;
        int included = -1;
        try {
            n = in.nextInt();
            array = new int[n];
            frequency = new int[n];
            for(int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
        } catch (InputMismatchException e) {
            in.close();
            return;
            //TODO: handle exception
        }finally {
            in.close();
        }
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]) {
                    count++;
                    frequency[j] = included;
                }
            }
            if (frequency[i] != included) {
                frequency[i] = count;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (frequency[i] != included) {
                System.out.printf("%d Angka %d\n", frequency[i], array[i]);
            }
        }
    }
}
