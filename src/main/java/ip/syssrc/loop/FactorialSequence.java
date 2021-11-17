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
        System.out.printf("%d! = ", fac);
        if (fac < 2) {
            System.out.printf("%d = 1\n", fac);
            return;
        }
        
        for (int i = fac; i >= 2; i--) {
            result *= i;
            System.out.printf("%d x ", i);        
        }

        System.out.printf("1 = %d\n", result);

    }

}
