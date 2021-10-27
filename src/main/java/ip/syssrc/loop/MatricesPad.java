package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
<<<<<<< HEAD
 * @author H071211064 - Agung Kartika Ardhiyanda <agungardhiyanda25@gmail.com>
 *
 */
import java.util.Scanner;
public class MatricesPad {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int start,end,i,size,j;
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
        
        for (i = start, j = 1; (start < end ? i <= end : i >= end); j++) {
            System.out.printf("%0"+ leadingZero + "d%s", i
            , ((j % size == 0 && j != 0) || i == end) ? "\n" : " ");
            if(start < end){
                i++;
            } else {
                i--;
            }
        }
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */

public class MatricesPad {

    public static void main(String[] args) {

>>>>>>> ef38dbc (feature(looping/Eyes): Add Scanner object)
    }
}
