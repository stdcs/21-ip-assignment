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

        for(i = 0; i < pembagi.length; i++){
            b = new int[8];
            desimal = a;
            System.out.printf("Base %2d: ", pembagi[i]);
            for(int j = (b.length - 1); desimal > 0; j--) {
                hasilbagi = (desimal % pembagi[i]);
                b[j] = (hasilbagi > 9) ? (hasilbagi + 55) : hasilbagi;
                desimal /= pembagi[i];
            }
            for (int z : b){
                if(z > 9){
                    System.out.printf("%c", (char) z);
                } else {
                    System.out.printf("%d", z);
                }
            }
            System.out.printf("%s", (i !=pembagi.length -1) ? "\n" : "");
        }

    }
}
