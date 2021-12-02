package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211051 - Febi Fiantika <febifian23@gmail.com>
 *
 */
import java.util.Scanner;
public class Eyes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
<<<<<<< HEAD
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
=======
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
>>>>>>> a15b8de (feat(loop/Eyes): add code)
            }
            System.out.println();
        }
    }
}
