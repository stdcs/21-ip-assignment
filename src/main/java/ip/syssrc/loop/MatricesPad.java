package ip.syssrc.loop;
import java.util.Scanner;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
<<<<<<< HEAD
<<<<<<< HEAD
 * @author H071211078 Muh Fajar Siddiq <fsiddiq072@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
 * @author H071211078 Muh Fajar Siddiq <fsiddiq072@gmail.com>
>>>>>>> 9cf23f9 (Update MatricesPad.java)
 *
 */
public class MatricesPad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
<<<<<<< HEAD
        int start = 0;
        int end = 0;
        int size = 0;
        try {
            start = in.nextInt();
            end = in.nextInt();
            size = in.nextInt();
            in.close();

            if(start < 0 || end < 0 || size <0){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Tolong masukkan input Bilangan Bulat >= 0");
            return;
            //TODO: handle exception
        }

        /**leading zero */
        int max = (start > end) ? start : end;
        int leadZero = 0;
        while (max > 0) {
            max /= 10;
            leadZero++;
        }
        /**OUTPUT */
        for (int i = start, j = 1; (start < end ? i <= end : i >= end); j++) {
            System.out.printf("%0" + leadZero + "d%s", i
            , ((j % size == 0 && j != 0) || i == end) ? "\n" : " ");
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }
    }
}
=======

        int start = in.nextInt();
        int end = in.nextInt();
        int size = in.nextInt();

        int range = end - start;
        int temp = start;

        if (start <= 9 && end <= 9) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%01d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= range % size; k++) {
                    System.out.printf("%01d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%01d ", temp);
                        temp--;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= -range % size; k++) {
                    System.out.printf("%01d ", temp);
                    temp--;
                }
            }
        } else if (start <= 99 && end <= 99) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%02d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= range % size; k++) {
                    System.out.printf("%02d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%02d ", temp);
                        temp--;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= -range % size; k++) {
                    System.out.printf("%02d ", temp);
                    temp--;
                }
            }
        } else if (start <= 999 && end <= 999) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%03d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= range % size; k++) {
                    System.out.printf("%03d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%03d ", temp);
                        temp--;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= -range % size; k++) {
                    System.out.printf("%03d ", temp);
                    temp--;
                }
            }
        }

        in.close();
    }
}
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
