package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211051 - Febi Fiantika <febifian23@gmail.com>
 *
 */
import java.util.Scanner;
public class MatricesPad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int end = in.nextInt();
        int size = in.nextInt();
<<<<<<< HEAD
<<<<<<< HEAD
        in.close();

        int biggest = (start > end) ? start : end;
        int leadingZero = 0;
        while (biggest > 0) {
            biggest /= 10;
            leadingZero++;
        }

        /** OUTPUT */
        for (int i = start; (start < end ? i <= end : i >= end); ) {
            if (((i - start) % size == 0 || (start - i) % size == 0) 
                    && (i != start)) {
                System.out.printf("\n");
            }

            System.out.printf("%0" + leadingZero + "d ", i);
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }

=======
        
=======
>>>>>>> 1b09600 (feat(loop/MatricesPad): add code)
        in.close();

        int biggest = (start > end) ? start : end;
        int leadingZero = 0;
        while (biggest > 0) {
            biggest /= 10;
            leadingZero++;
        }

        /** OUTPUT */
        for (int i = start; (start < end ? i <= end : i >= end); ) {
            if (((i - start) % size == 0 || (start - i) % size == 0) 
                    && (i != start)) {
                System.out.printf("\n");
            }

            System.out.printf("%0" + leadingZero + "d ", i);
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }
<<<<<<< HEAD
>>>>>>> a15b8de (feat(loop/Eyes): add code)
=======

>>>>>>> 2635779 (feat(loop/MatricesPad): add 'changecode' object)
    }
}
