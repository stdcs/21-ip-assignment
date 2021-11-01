package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211064 - Agung Kartika Ardhiyanda <agungardhiyanda25@gmail.com>
 *
 */
import java.util.Scanner;
public class MatricesPad {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int start,end,i,size;
        System.out.print("Start (Bilangan Bulat >= 0 ) = ");
        start = sc.nextInt();
        System.out.print("End (Bilangan Bulat >= 0 ) = ");
        end = sc.nextInt();
        System.out.print("Size (Bilangan Bulat >= 0 ) = ");
        size = sc.nextInt();
        sc.close();

        int terbesar = (start > end) ? start : end;
        int leadingZero = 0;
        
        while (terbesar > 0 ){
            terbesar /=10;
            leadingZero++;
        }
        
        for (i = start; (start < end ? i <= end : i >= end);) {
            if (((start - i ) % size == 0 || (i - start) % size == 0)
            && (i != start)) {
                System.out.printf("\n");
            }

            System.out.printf("%0" + leadingZero+ "d ", i);
            if(start < end){
                i++;
            } else {
                i--;
            }
        }
    }
}
