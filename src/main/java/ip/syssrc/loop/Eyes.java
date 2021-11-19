package ip.syssrc.loop;
import java.util.Scanner;
/**
 * Eyes
 *
 * Assignment 2.3
 *
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
 * @author H071171512 - Fitrah Muhammad <fitrhm17h@student.unhas.ac.id>
>>>>>>> c9b229e (feat(loop) : add assigment 2.1 2.2 2.3)
=======
 * @author H071171512 - Fitrah Muhammad <fitrhm17h@student.unhas.ac.id>
=======
<<<<<<< HEAD
<<<<<<< HEAD
 * @author H071211078 - Muh Fajar Siddiq <fsiddiq072@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrhm17h@student.unhas.ac.id>
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
 * @author H071211078 - Muh Fajar Siddiq <fsiddiq072@gmail.com>
>>>>>>> 800fcc6 (Update Eyes.java)
>>>>>>> 9ef5a78 (Update Eyes.java)
>>>>>>> e305609 (Update Eyes.java)
=======
 * @author H071211078 - Muh Fajar Siddiq <fsiddiq072@gmail.com>
>>>>>>> c1f7cd4 (fix(conditional);(loop) resolved merge conflict)
 *
 */
public class Eyes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 537e9b9 (fix(loop/Eyes): fix condition of if block from printing spaces)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c1f7cd4 (fix(conditional);(loop) resolved merge conflict)
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 4a60a21 (fix(loop/Eyes): fix condition of if block from printing spaces)
>>>>>>> 537e9b9 (fix(loop/Eyes): fix condition of if block from printing spaces)
        int n = in.nextInt();
=======
        int n;
>>>>>>> 0955c9c (fix(loop/Eyes): fix condition of if block from printing spaces)
<<<<<<< HEAD
=======
        int n = in.nextInt();
>>>>>>> c9b229e (feat(loop) : add assigment 2.1 2.2 2.3)
=======

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
>>>>>>> 537e9b9 (fix(loop/Eyes): fix condition of if block from printing spaces)

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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            System.out.println();
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
            System.out.printf("\n");
>>>>>>> 0955c9c (fix(loop/Eyes): fix condition of if block from printing spaces)
=======
            System.out.println();
>>>>>>> c9b229e (feat(loop) : add assigment 2.1 2.2 2.3)
=======
            System.out.println();
<<<<<<< HEAD
=======
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
            System.out.printf("\n");
>>>>>>> 0955c9c (fix(loop/Eyes): fix condition of if block from printing spaces)
>>>>>>> 4a60a21 (fix(loop/Eyes): fix condition of if block from printing spaces)
>>>>>>> 537e9b9 (fix(loop/Eyes): fix condition of if block from printing spaces)
=======
>>>>>>> c1f7cd4 (fix(conditional);(loop) resolved merge conflict)
        }
    }
}
