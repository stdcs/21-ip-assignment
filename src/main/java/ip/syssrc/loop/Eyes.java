package ip.syssrc.loop;
import java.util.Scanner;
/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211068 - Michael Gabriel Bida <michaelgabriel663@gmail.com>
 *
 */
public class Eyes {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int size;

        try {
            size = scan.nextInt();
        
            if (size <= 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Masukkan input bilangan bulat >= 0");
            return;
        }
        scan.close();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    System.out.printf("%d", 1);
                } else {
                    System.out.printf("%d", 0);
                }

                if (j < (size - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.printf("\n");
        }
    }
}

        