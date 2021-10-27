package ip.syssrc.loop;
import java.util.Scanner;
/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 *  @author H071211068 - Michael Gabriel Bida <michaelgabriel663@gmail.com>
 *
 */

public class MatricesPad {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int start;
        int end;
        int size;

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
        scan.close();

        int largest = (start > end) ? start : end;
        int leadingZero = 0;
        
        while (largest > 0) {
            largest /= 10;
            leadingZero++;
        }
        for (int i = start, j = 1; (start < end ? i <= end : i >= end); j++) {
            System.out.printf("%0" + leadingZero + "d%s", i
                , ((j % size == 0 && j != 0) || i == end) ? "\n" : " ");
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }
    }
}