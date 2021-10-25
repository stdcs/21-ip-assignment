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

        int n, sum;
        sum = 1;

        try {
            n = scan.nextInt();
            
            if (n < 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.print("Pastikan input adalah bilangan bulat >= 0");
        }

        
    }
}
