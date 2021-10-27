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
        Scanner nanda = new Scanner (System.in);
        int start = nanda.nextInt();
        int end = nanda.nextInt();
        int size = nanda.nextInt();

        int biggest = (start > end) ? start : end;
        int leadingZero = 0;
        
        while (biggest > 0) {
            biggest /= 10;
            leadingZero++;
        }
        for (int i = start; (start < end ? i <= end : i >= end); ) {
            if (((i - start) % size == 0 || (start - i) % size == 0) && (i != start)) {
                System.out.printf("\n");
            }

            System.out.printf("%0" + leadingZero + "d ", i);
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }

    }
}
