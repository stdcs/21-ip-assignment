package ip.syssrc.loop;
import java.util.Scanner;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211069 - Muhammad Faiz Fatwa Syarifuddin <faizfatwa030206@gmail.com>
 *
 */
public class Eyes {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int x;

        try {
            x = scan.nextInt();

            scan.close();

            if (x <= 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Masukkan input bilangan bulat >= 0");
            return;
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j == i) {
                    System.out.printf("%d", 1);
                } else {
                    System.out.printf("%d", 0);
                }

                if (j < (x - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.printf("\n");
        }
        scan.close();
    }
}
