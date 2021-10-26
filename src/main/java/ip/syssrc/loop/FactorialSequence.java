package ip.syssrc.loop;
import java.util.Scanner;
/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
<<<<<<< HEAD
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 * @author H0711211078 Muh Fajar Siddiq <fsiddiq072@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
 * @author H0711211078 Muh Fajar Siddiq <fsiddiq072@gmail.com>
>>>>>>> aca5ce6 (Update FactorialSequence.java)
<<<<<<< HEAD
>>>>>>> f2ae1a1 (Update FactorialSequence.java)
=======
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> c9b229e (feat(loop) : add assigment 2.1 2.2 2.3)
>>>>>>> fa26fc3 (feat(loop) : add assigment 2.1 2.2 2.3)
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long fact = 1;

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

        in.close();
 
    }
}
