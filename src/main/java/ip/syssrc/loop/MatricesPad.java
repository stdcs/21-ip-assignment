package ip.syssrc.loop;
import java.util.Scanner;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211078 Muh Fajar Siddiq <fsiddiq072@gmail.com>
 *
 */
public class MatricesPad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int size = 0;
        try {
            start = in.nextInt();
            end = in.nextInt();
            size = in.nextInt();
            in.close();

            if(start < 0 || end < 0 || size <0){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Tolong masukkan input Bilangan Bulat >= 0");
            return;
            //TODO: handle exception
        }

        /**leading zero */
        int max = (start > end) ? start : end;
        int leadZero = 0;
        while (max > 0) {
            max /= 10;
            leadZero++;
        }
        /**OUTPUT */
        for (int i = start, j = 1; (start < end ? i <= end : i >= end); j++) {
            System.out.printf("%0" + leadZero + "d%s", i
            , ((j % size == 0 && j != 0) || i == end) ? "\n" : " ");
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }
    }
}
