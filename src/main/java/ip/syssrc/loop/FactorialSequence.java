package ip.syssrc.loop;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

import java.util.Scanner;



=======
import java.util.Scanner;
>>>>>>> 837fe87 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
=======
=======
>>>>>>> 6380848 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
import java.util.Scanner;
=======

>>>>>>> 1411adb (feat(loop):add new java file)
<<<<<<< HEAD
>>>>>>> c536015 (feat(loop):add new java file)
=======
=======
import java.util.Scanner;
>>>>>>> 837fe87 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
>>>>>>> 6380848 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 *
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
 *
 *
=======
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
>>>>>>> 837fe87 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
=======
=======
>>>>>>> 6380848 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 1411adb (feat(loop):add new java file)
<<<<<<< HEAD
>>>>>>> c536015 (feat(loop):add new java file)
=======
=======
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
>>>>>>> 837fe87 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
>>>>>>> 6380848 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
        Scanner in = new Scanner(System.in);
<<<<<<< HEAD
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
<<<<<<< HEAD
=======

        long factorial = 1;
        int n = in.nextInt();
<<<<<<< HEAD
>>>>>>> 69e510c (feat(loop/FactorialSequence.java): add variabel)
        
>>>>>>> 837fe87 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
=======

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
>>>>>>> 7017a14 (feat(loop/FactorialSequence.java): add if else statement with loop)
=======

>>>>>>> 1411adb (feat(loop):add new java file)
<<<<<<< HEAD
>>>>>>> c536015 (feat(loop):add new java file)
=======
=======
        Scanner in = new Scanner(System.in);

        long factorial = 1;
        int n = in.nextInt();
        
>>>>>>> 837fe87 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
>>>>>>> 6380848 (feat(loop\FactorialSequence.java): add 'java.util.Scanner' object)
    }
}
