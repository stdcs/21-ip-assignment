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
<<<<<<< HEAD
<<<<<<< HEAD
        Scanner bk = new Scanner(System.in);
<<<<<<< HEAD
        int n = bk.nextInt();
        bk.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
=======
        Scanner in = new Scanner(System.in);
=======
        Scanner bk = new Scanner(System.in);
>>>>>>> a089113 (feat(loop/MatricesPad): add code)

        int n = bk.nextInt();
        bk.close();
<<<<<<< HEAD
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
>>>>>>> dc0ff31 (feat(loop): add assingment)
=======
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
>>>>>>> 2b50be3 (feat(loop/MatricesPad): add code)
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
<<<<<<< HEAD

>>>>>>> 9a9d39e (feat(loop): add assigment)
=======
>>>>>>> 39898f2 (feat(loop/Eyes): add code)
