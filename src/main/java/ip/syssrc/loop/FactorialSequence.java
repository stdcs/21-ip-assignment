package ip.syssrc.loop;
import java.util.Scanner;
/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211061 - St. Alya Ardani Aries <stalyaardaniaries@gmail.com>
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int x = 1;

        if (n > 0) {
            System.out.print(n + "! = ");

            for (int i = n; i >= 2; i--) {
                System.out.print(i + " × ");
                x = x * i;
            }   System.out.print("1 = " + x);
        
        } else if (n == 0) {
            System.out.print(n + "! = ");
            System.out.print("1");
        }
        in.close();
    }
}
