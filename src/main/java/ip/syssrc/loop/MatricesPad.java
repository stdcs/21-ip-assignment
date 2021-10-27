package ip.syssrc.loop;
import java.util.Scanner;
/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211060 - Andi Muh. Ibnu Hibban Bagoes Malolo <andibagoes1412@gmail.com>
 *
 */

public class MatricesPad {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int start = obj.nextInt();
        int end = obj.nextInt();
        int size = obj.nextInt();

        int range = end - start;
        int x = start;

        if (start <= 9 && end <= 9) {
            if (range >= 0) {
                for (int a = 1; a <= range / size; a++) {
                    for (int b = 1; b <= size; b++) {
                        System.out.printf("%01d ", x);
                        x++;
                    }
                    System.out.println("");
                }
                for (int c = 0; c <= range % size; c++) {
                    System.out.printf("%01d ", x);
                    x++;
                }
            } else if (range <= 0) {
                for (int a = 1; a <= -range / size; a++) {
                    for (int b = 1; b <= size; b++) {
                        System.out.printf("%01d ", x);
                        x--;
                    }
                    System.out.println("");
                }
                for (int c = 0; c <= -range % size; c++) {
                    System.out.printf("%01d ", x);
                    x--;
                }
            }
        } else if (start <= 99 && end <= 99) {
            if (range >= 0) {
                for (int a = 1; a <= range / size; a++) {
                    for (int b = 1; b <= size; b++) {
                        System.out.printf("%02d ", x);
                        x++;
                    }
                    System.out.println("");
                }
                for (int c = 0; c <= range % size; c++) {
                    System.out.printf("%02d ", x);
                    x++;
                }
            } else if (range <= 0) {
                for (int a = 1; a <= -range / size; a++) {
                    for (int b = 1; b <= size; b++) {
                        System.out.printf("%02d ", x);
                        x--;
                    }
                    System.out.println("");
                }
                for (int c = 0; c <= -range % size; c++) {
                    System.out.printf("%02d ", x);
                    x--;
                }
            }
        } else if (start <= 999 && end <= 999) {
            if (range >= 0) {
                for (int a = 1; a <= range / size; a++) {
                    for (int b = 1; b <= size; b++) {
                        System.out.printf("%03d ", x);
                        x++;
                    }
                    System.out.println("");
                }
                for (int c = 0; c <= range % size; c++) {
                    System.out.printf("%03d ", x);
                    x++;
                }
            } else if (range <= 0) {
                for (int a = 1; a <= -range / size; a++) {
                    for (int b = 1; b <= size; b++) {
                        System.out.printf("%03d ", x);
                        x--;
                    }
                    System.out.println("");
                }
                for (int c = 0; c <= -range % size; c++) {
                    System.out.printf("%03d ", x);
                    x--;
                }
            }
        }
        obj.close();
    }
}
