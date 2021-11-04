package ip.syssrc.array;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211069 - Muhammad Faiz Fatwa Syarifuddin <faizfatwa030206@gmail.com>
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

        for (int i = 0; i < numbers.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    counter++;
                    frequency[j] = included;
                }
            }

            if (frequency[i] != included) {
                frequency[i] = counter;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (frequency[i] != included) {
                System.out.printf("%d Angka %d\n", frequency[i], numbers[i]);
            }
        }
    }
}