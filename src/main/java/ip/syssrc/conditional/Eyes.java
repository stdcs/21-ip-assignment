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
        int size = sc.nextInt();
        int dummy = 0, n = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == dummy)
                    System.out.printf("%d ", n);
                else
                    System.out.printf("0 ");
            }
            dummy++;
            System.out.println();
        }

        sc.close();
    }

}
