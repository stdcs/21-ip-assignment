package ip.syssrc.loop;

import java.util.Scanner;



/**
 * Eyes
 *
 * Assignment 2.3
 *

 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>


 *
 */
public class Eyes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;

        try{
            n = in.nextInt();

            if (n < 1){
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("Inputan harus lebih besar dari nol! ");
            return;
        }
        
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == j){
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }   
}




