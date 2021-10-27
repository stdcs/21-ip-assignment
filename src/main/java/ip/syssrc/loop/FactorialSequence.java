package ip.syssrc.loop;

import java.util.Scanner;
/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211059 - Muhammad Erwin Arif <muherwinarif31@gmail.com>
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number, sum;
        sum = 1;

        try {
            number = scan.nextInt();
            scan.close();
            
            if (number < 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.print("Pastikan input adalah bilangan bulat >= 0");
            return;
        }

        System.out.printf("%d!", number);
        if (number != 0) {
            for (int i = number; i >= 1; i--) {
                sum *= i;
                if (i == number) {
                    System.out.printf(" = %d", i);
                } else {
                    System.out.printf(" x %d", i);
                }
            }
        } else {
            sum = 1;
        }
        System.out.printf(" = %d", sum);
    }
}
