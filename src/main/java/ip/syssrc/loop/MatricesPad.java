package ip.syssrc.loop;
import java.util.Scanner;
/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
 *
 */

public class MatricesPad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int size = in.nextInt();
        System.out.println(" ");

        int range = end - start;
        int temp = start;
        
        if (start < 10 && end < 10 ){
            if (range >= 0 ){
                for (int i = 1; i <= range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("%01d ", temp);
                        temp++;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= range % size; k++){
                    System.out.printf("%01d ", temp);
                    temp++;
                }
            } else if (range <= 0){
                for (int i = 1; i <= -range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("%01d ", temp);
                        temp--;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= -range % size; k++){
                    System.out.printf("%01d ", temp);
                    temp--;
                }
            }   
        } else if (start < 100 & end < 100){
            if (range >= 0){
                for (int i = 1; i <= range / size; i++){
                    for (int j= 1; j <= size; j++){
                        System.out.printf("%02d ", temp);
                        temp++;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= range % size; k++){
                    System.out.printf("%02d ", temp);
                    temp++;
                }
            } else if (range <= 0){
                for (int i = 1; i <= -range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("%02d ", temp);
                        temp--;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= - range % size; k++){
                    System.out.printf("%02d ", temp);
                    temp--;
                }
            }
        } else if (start < 1000 && end < 1000){
            if (range >= 0){
                for (int i = 1; i <= range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("%03d ", temp);
                        temp++;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= range % size; k++){
                    System.out.printf("%03d", temp);
                }
            } else if (range <= 0){
                for (int i = 1; i <= -range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("03d ", temp);
                        temp--;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= -range % size; k++){
                    System.out.printf("%03d ", temp);
                }
            }
        }
        in.close();
    }
}

