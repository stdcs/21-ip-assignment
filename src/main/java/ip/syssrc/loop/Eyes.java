package ip.syssrc.loop;

import java.util.Scanner;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211059 - Muhammad Erwin Arif <muherwinarif31@gmail.com>
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
    }
}
