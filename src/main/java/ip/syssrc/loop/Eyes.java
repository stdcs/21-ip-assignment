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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d%s", (i == j) ? 1 : 0,(j < n - 1) ? " " : "\n");
            }
        }scan.close();
    }
}
