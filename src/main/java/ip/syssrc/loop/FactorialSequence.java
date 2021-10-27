package ip.syssrc.loop;
<<<<<<< HEAD

import java.util.Scanner;



=======
import java.util.Scanner;
>>>>>>> 837fe87 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
<<<<<<< HEAD
 *
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
 *
 *
=======
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
>>>>>>> 837fe87 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
<<<<<<< HEAD

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
        
>>>>>>> 837fe87 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
    }
}
