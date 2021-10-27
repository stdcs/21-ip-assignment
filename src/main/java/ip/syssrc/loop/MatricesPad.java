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
        }
        in.close();
    }
}

