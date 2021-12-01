package ip.syssrc.loop;

import java.util.Scanner;



/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 *
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
 *
 *
 *
 */
public class FactorialSequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long factorial = 1;
        int n = in.nextInt();

        if (n > 0){
            System.out.print(n + "! = ");

            for (int i = n ; i >= 2; i--){
                System.out.print(i + " x ");
                factorial = factorial * i;
            }
            System.out.print("1 = " + factorial);
        
        } else if (n == 0){
            System.out.print(n + "! = ");

            System.out.println("1");
        } else {
            System.out.println("Error!");
        }
        in.close();
    }
}
