package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211064 - Agung Kartika Ardhiyanda <agungardhiyanda25@gmail.com>
 *
 */
import java.util.Scanner;
public class Eyes {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print("Input N = ");
        n = sc.nextInt();
      
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if( i == j) {
                    System.out.print("1 ");
                }
                else { 
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
            sc.close();
        }
       
    }
}
