package ip.syssrc.loop;

import java.util.Scanner;
/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211057 - AndiRajaZulfaqar <andiraja954@gmail.com>
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {
        int n, counter, faktorial = 1;
        System.out.print ("Masukan Angka : ");
        Scanner a= new Scanner (System.in);
        n= a.nextInt();
        if (n<0){
          System.out.println("Angka tidak boleh kurang dari 0");
        }
        else{
            for (counter=1; counter<=n; counter++){
                faktorial = faktorial * counter; 
            }
            System.out.println("Faktorial Dari Angka "+n+"! Adalah = "+faktorial); 
        }
    }
}
