package ip.syssrc.loop;
import java.util.Scanner;
/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211078 - Muh Fajar Siddiq <fsiddiq072@gmail.com>
 *
 */
public class Eyes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        try {
            n = in.nextInt();
            in.close();

            if (n <= 0){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Input Error");
            return;
            //TODO: handle exception
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.printf("%d", 1); 
                } else {
                    System.out.printf("%d", 0);
                }
<<<<<<< HEAD
                
=======

>>>>>>> c1f7cd40f4304067a7a133d14add23ccbde10b2a
                if ( j < (n - 1)){
                    System.out.print(" ");
                }
            }
            System.out.printf("\n");
        }
    }
}
