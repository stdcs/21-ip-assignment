package main.java.ip.syssrc.Loop;

/**
 * Eyes
 * 
 * Assignment 2.1
 * 
 *  * @author H071211084 - Suhastina <Suhastina88@gmail.com>
 * 
 */
import java.util.Scanner;

public class Eyes {
    public static void main(String[] args){
        Scanner t2 = new Scanner(System.in);

        int n = t2.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                //bug
            }
            System.out.println();
        }
    }
}