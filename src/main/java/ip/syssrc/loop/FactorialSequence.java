package ip.syssrc.loop;

/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211066 - Syifa Ur Rahmi <sifasisi3@gmail.com>
 *
 */
import java.util.Scanner;
public class FactorialSequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long factorial = 1;

        if (n > 0) {
            System.out.print(n + "! = ");
            for (int i = n; i >= 2; i--) {
                System.out.print(i + " x ");
                factorial = factorial * i;
            }
            System.out.print("1 = " + factorial);
        } else if (n == 0) {
            System.out.print(n + "! = ");
            System.out.println("1");
        }
        in.close();
    }
}
