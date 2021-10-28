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
      
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j < n - 1) ? " " : "\n");
            }
            sc.close();
        }
    }
 }
       
