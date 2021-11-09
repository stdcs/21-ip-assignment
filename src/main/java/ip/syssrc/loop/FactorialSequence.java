package ip.syssrc.loop;

/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211086 - Diza Alysha Zahra <dizalysha@gmail.com>
 *
 */
<<<<<<< HEAD

 import java.util.Scanner;
 public class FactorialSequence {
=======
public class FactorialSequence {
>>>>>>> 7cb0749e321ae9457187a88d63ee46f64d176ebf

    public static void main(String[] args) {
        Scanner Diza = new Scanner(System.in);

        long fact = 1;
        int n = Diza.nextInt();

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

        Diza.close();
    }
}