package ip.syssrc.loop;
import java.util.Scanner;
/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211060 - Andi Muh. Ibnu Hibban Bagoes Malolo <andibagoes1412@gmail.com>
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        long faktorial = 1;
        int n = obj.nextInt();

        if (n > 0) {
            System.out.print(n + "! = ");

            for (int i = n; i >= 2; i--) {
                System.out.print(i + " x ");
                faktorial = faktorial * i;
            }

            System.out.print("1 = " + faktorial);

        } else if (n == 0) {
            System.out.print(n + "! = ");

            System.out.println("1");
        } else {
            System.out.println("Error");
        }
        obj.close();
    }
}
