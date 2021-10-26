package ip.syssrc.loop;
import java.util.Scanner;
/**
 * Eyes
 *
 * Assignment 2.3
 *
<<<<<<< HEAD
 * @author H071211078 - Muh Fajar Siddiq <fsiddiq072@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrhm17h@student.unhas.ac.id>
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
 *
 */
public class Eyes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

<<<<<<< HEAD
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
                
                if ( j < (n - 1)){
                    System.out.print(" ");
                }
            }
            System.out.printf("\n");
=======
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
        }
    }
}
