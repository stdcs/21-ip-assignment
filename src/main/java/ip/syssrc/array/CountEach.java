package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 *@author H071211080 - Dirgantry Leonard Nugrah Boro <dirgantryleonardnugrahboro@gmail.com>
 *
 */

import java.util.Scanner;

public class CountEach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int[] angka;
        int[] frekuensi;
        Integer included = null;

        n = scan.nextInt();
        angka = new int[n];
        frekuensi = new int[n];
        for (int i = 0; i < n; i++) {
            angka[i] = scan.nextInt();
        }
        for (int i = 0; i < angka.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[i] == angka[j]) {
                    counter++;
                    frekuensi[j] = included;
                }
            }
            if (frekuensi[i] != included)
                frekuensi[i] = counter;

            for (int j = 0; j < angka.length; j++) {
                if (frekuensi[j] != included) {
                    System.out.printf("%d Angka %d\n", frekuensi[i], angka[i]);
                }
            }

        }
    }
}
