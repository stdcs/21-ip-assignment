package ip.syssrc.loop;
import java.util.Scanner;
/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 *  @author H071211068 - Michael Gabriel Bida <michaelgabriel663@gmail.com>
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long fact = 1;
        int n = scan.nextInt();

        scan.close();
    
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