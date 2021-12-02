package ip.syssrc.loop;

/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211051 - Febi Fiantika <febifian23@gmail.com>
 *
 */
import java.util.Scanner;
public class FactorialSequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long fact = 1;
        int n = in.nextInt();
        in.close();

        if (n > 0) {
            System.out.print(n + "! = ");

            for (int i = n; i >= 2; i--) {
                System.out.print(i + " x ");
                fact = fact * i;
            }

            System.out.print("1 = " + fact);

        } else if (n == 0) {
            System.out.print(n + "! = ");

            System.out.println("1");
        } else {
            System.out.println("Error");
<<<<<<< HEAD
            
=======
>>>>>>> a15b8de (feat(loop/Eyes): add code)
        }
    }
}
