package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211073 - Djulizah Bonita L
 *
 */
import java.util.Scanner;
public class Eyes {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);
        int n;

        System.out.print("Input n = ");
        n = In.nextInt();

        In.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                System.out.printf("%d%s", (i == j)? 1 : 0, (j < n)? " " : "\n" );
            }
        }
    }
}
