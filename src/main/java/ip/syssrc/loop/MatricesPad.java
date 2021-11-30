package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211074 - Wd. Ananda Lesmono <nandalesmono@gmail.com>
 *
 */
import java.util.Scanner;
public class MatricesPad {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner dede = new Scanner (System.in);
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        Scanner dede = new Scanner (System.in);
        
        int start, end, size;
        try {
            start = dede.nextInt();
            end = dede.nextInt();
            size = dede.nextInt();
            if (start < 0 || end < 0 || size <= 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Masukkan bilangan bulat diatas nol");
            return;
        }
        if (start == 0 && end == 0) {
            System.out.println(0);
            System.exit(0);
        }
    
        int biggest = (start > end) ? start : end;
        int leadingZero = 0;
        int j = 1;
=======
=======
>>>>>>> 192d72a (feat(loop/Eyes): add format 'for')
        Scanner nanda = new Scanner (System.in);
        int start = nanda.nextInt();
        int end = nanda.nextInt();
        int size = nanda.nextInt();
<<<<<<< HEAD
=======
        Scanner dede = new Scanner (System.in);
<<<<<<< HEAD
        int start = dede.nextInt();
        int end = dede.nextInt();
        int size = dede.nextInt();
>>>>>>> 2e04a02 (feat(loop/MatricesPad): add format 'for' and 'if')
>>>>>>> 5562406 (delete)

        int start, end, size;
        try {
            start = dede.nextInt();
            end = dede.nextInt();
            size = dede.nextInt();
            if (start < 0 || end < 0 || size <= 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Masukkan bilangan bulat diatas nol");
            return;
        }
        if (start == 0 && end == 0) {
            System.out.println(0);
            System.exit(0);
        }
        
        int biggest = (start > end) ? start : end;
        int leadingZero = 0;
        int j = 1;
<<<<<<< HEAD
=======
>>>>>>> ed91612 (fix(loop/MatricesPad): change sysout)
=======
=======
        Scanner dede = new Scanner (System.in);
        int start = dede.nextInt();
        int end = dede.nextInt();
        int size = dede.nextInt();
>>>>>>> 9e6b349 (feat(loop/MatricesPad): add format 'for' and 'if')

        int biggest = (start > end) ? start : end;
        int leadingZero = 0;
>>>>>>> 192d72a (feat(loop/Eyes): add format 'for')
>>>>>>> 5562406 (delete)
        
        while (biggest > 0) {
            biggest /= 10;
            leadingZero++;
        }
<<<<<<< HEAD
 
        for (int i = start; (start < end ? i <= end : i >= end); j++) {
            System.out.printf("%0" + leadingZero + "d%s", i, (j != 0 && j % size == 0  || (i == end)) ? "\n" : " ");
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        for (int i = start; (start < end ? i <= end : i >= end); j++) {
            System.out.printf("%0" + leadingZero + "d%s", i, (j != 0 && j % size == 0  || (i == end)) ? "\n" : " ");
=======
=======
>>>>>>> 192d72a (feat(loop/Eyes): add format 'for')
        for (int i = start; (start < end ? i <= end : i >= end); ) {
            if (((i - start) % size == 0 || (start - i) % size == 0) && (i != start)) {
                System.out.printf("\n");
            }

            System.out.printf("%0" + leadingZero + "d ", i);
<<<<<<< HEAD
>>>>>>> c61ffb5 (feat(loop/Eyes): add format 'for')
=======
        for (int i = start; (start < end ? i <= end : i >= end); j++) {
            System.out.printf("%0" + leadingZero + "d%s", i, (j != 0 && j % size == 0  || (i == end)) ? "\n" : " ");
>>>>>>> ed91612 (fix(loop/MatricesPad): change sysout)
=======
>>>>>>> 192d72a (feat(loop/Eyes): add format 'for')
>>>>>>> 5562406 (delete)
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }

    }
}
