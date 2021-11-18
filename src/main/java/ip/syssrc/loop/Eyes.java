package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211086 - Diza Alysha Zahra <dizalysha@gmail.com>
 *
 */
<<<<<<< HEAD
import java.util.Scanner;
 public class Eyes {

    public static void main(String[] args) {
        Scanner Diza = new Scanner (System.in);
=======
public class Eyes {

    public static void main(String[] args) {
        Scanner Diza = new Scanner(System.in);

>>>>>>> 638cbda (feat(loop/Eyes):add code)
        int n = Diza.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
<<<<<<< HEAD
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
            }
            System.out.println();
        }
=======
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        Diza.close();
>>>>>>> 638cbda (feat(loop/Eyes):add code)
    }
}