package ip.syssrc.loop;
import java.util.Scanner;
/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211061 - St. Alya Ardani Aries <stalyaardaniaries@gmail.com>
 *
 */

public class MatricesPad {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int size = in.nextInt();
        int temp = start;

        if (end >= start) {
            while(end >= start) {
                for(int i=0; i < size; i++) {
                    if (start == end) {
                        break;
                    }
                    if (start < 10) {
                        System.out.print("0" + start + " ");
                    } else {
                        System.out.print(start + " ");
                    }
                    start++;
                }
                if (start == end) {
                    if ((temp - end) % size == 0) {
                        if (start < 10) {
                            System.out.println("");
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println("");
                            System.out.println(start);
                            break;
                        }
                    } else {
                        if (start < 10) {
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println(start);
                            break;
                        }
                    }
                }
                System.out.println();
            }
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
