package ip.syssrc.loop;
<<<<<<< HEAD
import java.util.Scanner;
=======

>>>>>>> 1411adb (feat(loop):add new java file)
/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
<<<<<<< HEAD
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 1411adb (feat(loop):add new java file)
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner in = new Scanner(System.in);

        long factorial = 1;
        int n = in.nextInt();

        if (n > 0){
            System.out.print(n + "! = ");

            for (int i = n ; i >= 2; i--){
                System.out.print(i + " x ");
                factorial = factorial * i;
            }
            System.out.print("1 = " + factorial);
        
        } else if (n == 0){
            System.out.print(n + "! = ");

            System.out.println("1");
        } else {
            System.out.println("Error!");
        }
        in.close();
=======

>>>>>>> 1411adb (feat(loop):add new java file)
    }
}
