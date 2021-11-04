package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
import java.util.Scanner;
public class CountEach {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] array = new int[100];
        int[] frekuensi = new int[100];
        int hitung;

        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
            frekuensi[i] = -1;
        }

        for (int i = 0; i < N; i++){
            hitung = 1;
            for (int j = i + 1; j < N; j++){
                if (array[i] == array[j]){
                    hitung++;
                    frekuensi[j] = 0;
                }
            }
            if (frekuensi[i] != 0) {
                frekuensi[i] = hitung;
            }
        }
        for (int i = 0; i < N; i++){
            if (frekuensi[i] != 0) {
                System.out.println(frekuensi[i] + " Angka " + array[i]);
            }
        }
        in.close();
    }
}
