package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211053 - Aditya Erlangga Bagaskara <aditya.erlangga0206@gmail.com>
 *
 */
import java.util.Scanner;

public class Eyes {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);

        int n = In.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}