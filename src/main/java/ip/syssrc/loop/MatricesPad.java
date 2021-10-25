package ip.syssrc.loop;

import java.util.Scanner;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211059 - Muhammad Erwin Arif <muherwinarif31@gmail.com>
 *
 */

public class MatricesPad {

    public static void main(String[] args) {
<<<<<<< HEAD

=======
        Scanner scan = new Scanner(System.in);

        int start, end, size;

        try {
            start = scan.nextInt();
            end = scan.nextInt();
            size = scan.nextInt();
            
            if (start < 0 || end < 0 || size < 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Masukkan bilangan bulat >= 0");
            return;
        }


<<<<<<< HEAD
        
<<<<<<< HEAD
>>>>>>> f2ee0d0 (feat(loop/MatricesPad): add `java.util.Scanner` object)
=======
=======
>>>>>>> 6056db5 (feat(loop/MatricesPad): add `try catch` block to filter input)

>>>>>>> 1255b9f (feat(loop/MatricesPad): assign values of `start`, `end`, `size`)
    }
}
