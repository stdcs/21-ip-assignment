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
<<<<<<< HEAD
        for (int i=0; i < n; i++) {
            for (int j = 0; j < n; j++) {
=======
=======
>>>>>>> ee9ef23 (delete)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5562406 (delete)
=======
>>>>>>> 15df50e (delete)
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
<<<<<<< HEAD
>>>>>>> f98dc4b (delete)
=======
=======
        for (int i=0; i < n; i++) {
            for (int j = 0; j < n; j++) {
>>>>>>> b83a662 (delete)
>>>>>>> ee9ef23 (delete)
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c61ffb5 (feat(loop/Eyes): add format 'for')
=======
=======
>>>>>>> f98dc4b (delete)
=======
>>>>>>> ee9ef23 (delete)
                    System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
<<<<<<< HEAD
>>>>>>> 4e7114f (fix(loop/Eyes): delete space)
=======
                if (i == j) {
                    System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
                } else {
                    System.out.printf("%d%s", (i != j) ? 0 : 1, (j <= n) ? " " : "\n");;
                }
>>>>>>> 192d72a (feat(loop/Eyes): add format 'for')
<<<<<<< HEAD
>>>>>>> 5562406 (delete)
=======
=======
                    System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
>>>>>>> 308cfbd (fix(loop/Eyes): delete 'if')
<<<<<<< HEAD
>>>>>>> 56fc5a4 (delete)
=======
=======
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
>>>>>>> a45577b (fix(loop/Eyes): delete space)
<<<<<<< HEAD
>>>>>>> ea78847 (delete)
=======
=======
                if (i == j) {
                    System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
                } else {
                    System.out.printf("%d%s", (i != j) ? 0 : 1, (j <= n) ? " " : "\n");;
                }
>>>>>>> c61ffb5 (feat(loop/Eyes): add format 'for')
<<<<<<< HEAD
>>>>>>> 74466dd (delete)
=======
=======
                    System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
>>>>>>> 9c1dfb9 (fix(loop/Eyes): delete 'if')
<<<<<<< HEAD
>>>>>>> b12ae9f (delete)
=======
=======
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
>>>>>>> 4e7114f (fix(loop/Eyes): delete space)
<<<<<<< HEAD
>>>>>>> ae9adcc (delete)
=======
=======
>>>>>>> 15df50e (delete)
<<<<<<< HEAD
>>>>>>> f98dc4b (delete)
=======
=======
>>>>>>> b83a662 (delete)
>>>>>>> ee9ef23 (delete)
            }
            System.out.println();
        }
    }
}
