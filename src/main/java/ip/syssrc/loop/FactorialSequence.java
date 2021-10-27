package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211072 - Dewa Rescue Virgiawansyah <dr3scue2003@gmail.com>
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