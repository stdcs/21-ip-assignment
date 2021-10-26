package ip.syssrc.loop;
import java.util.Scanner;
/**
 * Eyes
 *
 * Assignment 2.3
 *
<<<<<<< HEAD
 * @author H071171512 - Fitrah Muhammad <fitrhm17h@student.unhas.ac.id>
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 * @author H071211078 - Muh Fajar Siddiq <fsiddiq072@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrhm17h@student.unhas.ac.id>
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
 * @author H071211078 - Muh Fajar Siddiq <fsiddiq072@gmail.com>
>>>>>>> 800fcc6 (Update Eyes.java)
<<<<<<< HEAD
>>>>>>> 9ef5a78 (Update Eyes.java)
=======
=======
 * @author H071171512 - Fitrah Muhammad <fitrhm17h@student.unhas.ac.id>
>>>>>>> c9b229e (feat(loop) : add assigment 2.1 2.2 2.3)
>>>>>>> fa26fc3 (feat(loop) : add assigment 2.1 2.2 2.3)
 *
 */
public class Eyes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 4a60a21 (fix(loop/Eyes): fix condition of if block from printing spaces)
        int n = in.nextInt();
=======
        int n;
>>>>>>> 0955c9c (fix(loop/Eyes): fix condition of if block from printing spaces)
=======
        int n = in.nextInt();
>>>>>>> c9b229e (feat(loop) : add assigment 2.1 2.2 2.3)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
<<<<<<< HEAD
<<<<<<< HEAD
            System.out.println();
<<<<<<< HEAD
=======
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
            System.out.printf("\n");
>>>>>>> 0955c9c (fix(loop/Eyes): fix condition of if block from printing spaces)
<<<<<<< HEAD
>>>>>>> 4a60a21 (fix(loop/Eyes): fix condition of if block from printing spaces)
=======
=======
            System.out.println();
>>>>>>> c9b229e (feat(loop) : add assigment 2.1 2.2 2.3)
>>>>>>> fa26fc3 (feat(loop) : add assigment 2.1 2.2 2.3)
        }
    }
}
