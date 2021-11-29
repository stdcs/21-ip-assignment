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
        
        while (biggest > 0) {
            biggest /= 10;
            leadingZero++;
        }
 
        for (int i = start; (start < end ? i <= end : i >= end); j++) {
            System.out.printf("%0" + leadingZero + "d%s", i, (j != 0 && j % size == 0  || (i == end)) ? "\n" : " ");
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }

    }
}
