package ip.syssrc.loop;

/**
 * MatrixWithPad
 * 
 * Assignment 2.1
 * 
 * @author H071211084 - Suhastina <Suhastina88@gmail.com>
 * 
 */
import java.util.Scanner;

public class MatrixWithPad {
    public static void main(String[] args) {

        Scanner t2 = new Scanner(System.in);

        int start = t2.nextInt();
        int end = t2.nextInt();
        int size = t2.nextInt();

        int range = end - start;
        int temp = start;

        if (start <= 9 && end <= 9) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int s = 1; s <= size; s++) {
                        System.out.printf("%01d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int n = 0; n <= range % size; n++) {
                    System.out.printf("%01d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int s = 1; s <= size; s++) {
                        System.out.printf("%01d ", temp);
                        temp--;
                    }
                    //okeyyy
                    System.out.println("");
                }
                for (int n = 0; n <= -range % size; n++) {
                    System.out.printf("%01d ", temp);
                    temp--;
                }
            }
        } else if (start <= 99 && end <= 99) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int s = 1; s <= size; s++) {
                        System.out.printf("%02d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int n = 0; n <= range % size; n++) {
                    System.out.printf("%02d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int s = 1; s <= size; s++) {
                        System.out.printf("%02d ", temp);
                        temp--;
                    }
                    System.out.println("");
                }
                for (int n = 0; n <= -range % size; n++) {
                    System.out.printf("%02d ", temp);
                    temp--;
                }
            }
        } else if (start <= 999 && end <= 999) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int s = 1; s <= size; s++) {
                        System.out.printf("%03d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int n = 0; n <= range % size; n++) {
                    System.out.printf("%03d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int s = 1; s <= size; s++) {
                        System.out.printf("%03d ", temp);
                        temp--;
                    }
                    System.out.println("");
                }
                for (int n = 0; n <= -range % size; n++) {
                    System.out.printf("%03d ", temp);
                    temp--;
                }
            }
        }

        t2.close();
    }
}
