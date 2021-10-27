package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071121080 - Dirgantry Leonard Nugrah Boro <dirgantryleonardnugrahboro@gmail.com>
 *
 */
import java.util.Scanner;

public class Eyes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int size = sc.nextInt();
        int digit = start > end ? Integer.parseInt(String.valueOf(String.valueOf(start).length()))
                : Integer.parseInt(String.valueOf(String.valueOf(end).length()));
        int dummy = 0;

        if (start < end) {
            for (int j = start; j <= end; j++) {
                System.out.printf("%0" + digit + "d\t", j);
                dummy++;
                if (dummy == size) {
                    dummy = 0;
                    System.out.println();
                }
            }
        } else {
            for (int j = start; j >= end; j--) {
                System.out.printf("%0" + digit + "d\t", j);
                dummy++;
                if (dummy == size) {
                    dummy = 0;
                    System.out.println();
                }
            }
        }

        sc.close();

    }
}
