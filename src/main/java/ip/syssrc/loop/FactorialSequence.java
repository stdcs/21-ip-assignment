package ip.syssrc.loop;

/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211074 - Wd. Ananda lesmono <nandalesmono@gmail.com>
 *
 */
import java.util.Scanner;
public class FactorialSequence {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner dede = new Scanner (System.in);
        long fact = 1;
        int n = dede.nextInt();
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        Scanner dede = new Scanner (System.in);
        long fact = 1;
        int n = dede.nextInt();
=======
        Scanner nanda = new Scanner (System.in);
        long fact = 1;
        int n = nanda.nextInt();
>>>>>>> c61ffb5 (feat(loop/Eyes): add format 'for')
=======
        Scanner dede = new Scanner (System.in);
        long fact = 1;
        int n = dede.nextInt();
>>>>>>> 05efe90 (feat(loop/FactorialSequence): add format 'if' and 'for')
=======
        Scanner nanda = new Scanner (System.in);
        long fact = 1;
        int n = nanda.nextInt();
>>>>>>> 192d72a (feat(loop/Eyes): add format 'for')
<<<<<<< HEAD
>>>>>>> 5562406 (delete)
=======
=======
        Scanner dede = new Scanner (System.in);
        long fact = 1;
        int n = dede.nextInt();
>>>>>>> 4d33902 (feat(loop/FactorialSequence): add format 'if' and 'for')
<<<<<<< HEAD
>>>>>>> 41cf754 (delete)
=======
=======
        Scanner nanda = new Scanner (System.in);
        long fact = 1;
        int n = nanda.nextInt();
>>>>>>> c61ffb5 (feat(loop/Eyes): add format 'for')
<<<<<<< HEAD
>>>>>>> 74466dd (delete)
=======
=======
        Scanner dede = new Scanner (System.in);
        long fact = 1;
        int n = dede.nextInt();
>>>>>>> 05efe90 (feat(loop/FactorialSequence): add format 'if' and 'for')
<<<<<<< HEAD
>>>>>>> c71624a (delete)
=======
=======
        Scanner dede = new Scanner (System.in);
        long fact = 1;
        int n = dede.nextInt();
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)

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

    }
}
