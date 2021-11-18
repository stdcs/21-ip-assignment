package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211074 - Wd. Ananda Lesmono <nandalesmono@gmail.com>
 *
 */
import java.util.Scanner;
public class Eyes {

    public static void main(String[] args) {
        Scanner dede = new Scanner (System.in);

        int n = dede.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
                if (i == j) {
                    System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
                } else {
                    System.out.printf("%d%s", (i != j) ? 0 : 1, (j <= n) ? " " : "\n");;
                }
                    System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
            }
            System.out.println();
        }

    }
}
