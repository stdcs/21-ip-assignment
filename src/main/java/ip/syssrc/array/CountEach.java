package ip.syssrc.array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211059 - Muhammad Erwin Arif <muherwinarif31@gmail.com>
 *
 */

public class CountEach {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int[] numbers;
        int[] frequency;
        int included = -1;

        try {
            n = scan.nextInt();
            numbers = new int[n];
            frequency = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = scan.nextInt();
            }
        } catch (InputMismatchException e) {
            scan.close();
            return;
        } finally {
            scan.close();
        }
    }
}
