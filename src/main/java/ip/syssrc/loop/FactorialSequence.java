package ip.syssrc.loop;

/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211073 - Djulizah Bonita L
 *
 */

import java.util.Scanner;
public class FactorialSequence {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = In.nextInt();

        In.close();

        int i = 1;
        for (int c = 1;  c<=n; c++) {
            i = i*c;
        }
        System.out.printf("%d ! = ", n);
        
        for (int c = n;  c >= 2; c--) {
            System.out.printf("%d x ", c);
        }
        
        if(n == 0){
            System.out.println(i );
        }else
        System.out.println("1 = "+i );
        

        

    }
}
