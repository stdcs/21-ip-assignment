package ip.syssrc.loop;

/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
<<<<<<< HEAD
 * @author H071211041 - Fathur Rachman Alamsyag <sembarangm135@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 3455b10 (feat(loop): add assignment)
 *
 */
import java.util.Scanner;

public class FactorialSequence {

    public static void main(String[] args) {

        Scanner t2 = new Scanner(System.in);

        long fact = 1;
        int n = t2.nextInt();

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
        }

        t2.close();
    }
}
