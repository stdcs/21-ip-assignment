package ip.syssrc.loop;

import java.util.Scanner;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211070 - Firmansyah <frmnsyah33@gmail.com>
 *
 */
public class Eyes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(5 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }scan.close();

    }
}
