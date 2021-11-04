package ip.syssrc.array;

/**
 * RadixConverter
 *
 * Assignment 3.2
 *
 * @author H071211064 - Agung Kartika Ardhiyanda  <agungardhiyanda25@gmail.com>
 *
 */
import java.util.Scanner;
public class RadixConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,i,desimal,hasilbagi;
        int[]b;
        int[]pembagi = {2, 8, 16 };
        
        a = sc.nextInt();
        sc.close();

        for(i = 0; i < divider.length; i++){
            b = new int[8];
            desimal = a;
            System.out.printf("Base %2d: ", pembagi[i]);
            for(int j = (b.length - 1); decimal > 0; j--) {
                hasilbagi = (decimal % pembagi[i]);
                b[j] = (hasilbagi > 9) ? (hasilbagi + 55) : hasilbagi;
                desimal /= pembagi[i];
            }
            for (int z : b){
                if(z > 9){
                    System.out.printf("%c", (char) d);
                } else {
                    System.out.printf("%d", d);
                }
            }
            System.out.printf("%s", (i !=pembagi.length -1) ? "\n" : "");
        }

    }
}
