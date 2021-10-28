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

<<<<<<< HEAD
        for (int i=0; i < n; i++) {
            for (int j = 0; j < n; j++) {
=======
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
=======
>>>>>>> 5562406 (delete)
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
<<<<<<< HEAD
=======
>>>>>>> c61ffb5 (feat(loop/Eyes): add format 'for')
=======
                    System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
>>>>>>> 9c1dfb9 (fix(loop/Eyes): delete 'if')
=======
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
>>>>>>> 4e7114f (fix(loop/Eyes): delete space)
=======
                if (i == j) {
                    System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
                } else {
                    System.out.printf("%d%s", (i != j) ? 0 : 1, (j <= n) ? " " : "\n");;
                }
>>>>>>> 192d72a (feat(loop/Eyes): add format 'for')
>>>>>>> 5562406 (delete)
            }
            System.out.println();
        }
    }
}
