package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211041 - Fathur Rachman Alamsyah <sembarangm135@gmail.com>
 *
 */
import java.util.Scanner;

public class Eyes {

    public static void main(String[] args) {

        Scanner t2 = new Scanner(System.in);

        int n = t2.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            if (i == n - 1) {
                System.out.print("1\n");
            } else {
                System.out.print("0\n");
            }
        }
        t2.close();
    }
}