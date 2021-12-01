package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211071 - Muhammad Dzacky Ilham <dzackyilham01@gmail.com>
 *
 */

import java.util.Scanner;
public class CountEach {

    public static void main(String[] args) {
        Scanner kyy = new Scanner(System.in);
        int n = kyy.nextInt();
        int[] array = new int[10000000];
        for (int i = 0; i < n; i++) {
            int var = kyy.nextInt();
            array[var]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {

            } else {
                System.out.println(array[i] + " angka " + i);
            }
        }
        kyy.close();
       
    }
}

    

