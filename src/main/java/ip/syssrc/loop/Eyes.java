package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211065 - Asehpryanto Rari Parinding <asehpryantorari@gmail.com>
 *
 */
import java.util.Scanner;
public class Eyes {

    public static void main(String[] args) {
        Scanner bk = new Scanner(System.in);
        int bk = bk.nextInt();
        bk.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            if (i == n-1) {
                System.out.printf("1\n");
            } else {
                System.out.printf("0\n");
            }
        }
    }
}
