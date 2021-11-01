package ip.syssrc.loop;

/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071121080 - Dirgantry Leonard Nugrah Boro <dirgantryleonardnugrahboro@gmail.com>
 *
 */
import java.util.Scanner;

public class FactorialSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fac = sc.nextInt();
        long result = 1;
        String kal = "";

        for (int i = fac; i > 0; i--) {
            result *= i;

            if (i > 1)
                kal += i + " x ";
            else
                kal += i;

        }
        if (fac != 0)
            System.out.printf("%d! = %s = %d", fac, kal, result);
        else
            System.out.printf("%d! = %d", fac, result);

    }

}
