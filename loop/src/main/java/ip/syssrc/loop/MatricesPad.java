package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211051 - Febi Fiantika <febifian23@gmail.com>
 *
 */
import java.util.Scanner;
public class MatricesPad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int end = in.nextInt();
        int size = in.nextInt();
<<<<<<< HEAD
        in.close();

        int biggest = (start > end) ? start : end;
        int leadingZero = 0;
        while (biggest > 0) {
            biggest /= 10;
            leadingZero++;
        }

        /** OUTPUT */
        for (int i = start; (start < end ? i <= end : i >= end); ) {
            if (((i - start) % size == 0 || (start - i) % size == 0) 
                    && (i != start)) {
                System.out.printf("\n");
            }

            System.out.printf("%0" + leadingZero + "d ", i);
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }

=======
        
        in.close();

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
>>>>>>> a15b8de (feat(loop/Eyes): add code)
    }
}
