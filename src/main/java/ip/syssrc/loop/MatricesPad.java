package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071121080 - Dirgantry Leonard Nugrah Boro <dirgantryleonardnugrahboro@gmail.com>
 *
 */

import java.util.Scanner;

public class MatricesPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan bilangan bulat >=0 ");

        int start = sc.nextInt();
        int end = sc.nextInt();
        int size = sc.nextInt();
        int biggest;
        int leadingZero = 0;

        biggest = (start > end) ? start : end;     //2 5 10
        leadingZero = 0;
        while (biggest > 0) {
            biggest /= 10;
            leadingZero++;
        }

        for (int i = start, j = 1; (start < end ? i <= end : i >= end); j++) {
            System.out.printf("%0" + leadingZero + "d", i);
            // .printf("%03d", i);
            System.out.printf("%s", (j % size == 0 || i == end) ? "\n" : "");
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }
    }
}
