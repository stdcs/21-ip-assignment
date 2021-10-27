package ip.syssrc.loop;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

import java.util.Scanner;



=======
import java.util.Scanner;
>>>>>>> d8441de (feat(loop/Eyes.java): add 'java.util.Scanner' object)
=======
=======
>>>>>>> 2761c00 (feat(loop/Eyes.java): add 'java.util.Scanner' object)
import java.util.Scanner;
=======

>>>>>>> 1411adb (feat(loop):add new java file)
<<<<<<< HEAD
>>>>>>> c536015 (feat(loop):add new java file)
=======
=======
import java.util.Scanner;
>>>>>>> d8441de (feat(loop/Eyes.java): add 'java.util.Scanner' object)
>>>>>>> 2761c00 (feat(loop/Eyes.java): add 'java.util.Scanner' object)
/**
 * Eyes
 *
 * Assignment 2.3
 *
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>


=======
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
>>>>>>> d8441de (feat(loop/Eyes.java): add 'java.util.Scanner' object)
=======
=======
>>>>>>> 2761c00 (feat(loop/Eyes.java): add 'java.util.Scanner' object)
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrhm17h@student.unhas.ac.id>
>>>>>>> 1411adb (feat(loop):add new java file)
<<<<<<< HEAD
>>>>>>> c536015 (feat(loop):add new java file)
=======
=======
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
>>>>>>> d8441de (feat(loop/Eyes.java): add 'java.util.Scanner' object)
>>>>>>> 2761c00 (feat(loop/Eyes.java): add 'java.util.Scanner' object)
 *
 */
public class Eyes {

    public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

        Scanner in = new Scanner(System.in);
        int n;

        try{
            n = in.nextInt();

            if (n < 1){
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("Inputan harus lebih besar dari nol! ");
            return;
        }
        
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == j){
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }   
=======
=======
>>>>>>> c536015 (feat(loop):add new java file)
=======
>>>>>>> 2761c00 (feat(loop/Eyes.java): add 'java.util.Scanner' object)
        Scanner in = new Scanner(System.in);
        int n;

        try{
            n = in.nextInt();

            if (n < 1){
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("Inputan harus lebih besar dari nol! ");
            return;
        }
        
<<<<<<< HEAD

    }
>>>>>>> d8441de (feat(loop/Eyes.java): add 'java.util.Scanner' object)
=======
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == j){
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }   
<<<<<<< HEAD
>>>>>>> 58fbd47 (feat(loop/Eyes.java): add 'if else' stament with for loop  and fix 'try catch' statement)
=======
=======

=======
        Scanner in = new Scanner(System.in);
        int n;

        try{
            n = in.nextInt();

            if (n < 0){
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("Inputan harus lebih besar dari nol ( < 0 ) ");
            return;
        }
        
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d8441de (feat(loop/Eyes.java): add 'java.util.Scanner' object)
=======

>>>>>>> 0c0afac (feat(loop/Eyes.java): add 'try catch' statement)
    }
>>>>>>> 1411adb (feat(loop):add new java file)
<<<<<<< HEAD
>>>>>>> c536015 (feat(loop):add new java file)
=======
=======
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == j){
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }   
>>>>>>> 58fbd47 (feat(loop/Eyes.java): add 'if else' stament with for loop  and fix 'try catch' statement)
>>>>>>> a1f96a5 (feat(loop/Eyes.java): add 'if else' stament with for loop)
}




