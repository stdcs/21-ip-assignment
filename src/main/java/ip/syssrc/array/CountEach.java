package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211072 - Dewa Rescue Virgiawansyah <dr3scue2003@gmail.com>
 *
 */
import java.util.Scanner;
import java.util.InputMismatchException;

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
            scan.close();
        } catch (InputMismatchException e) {
            return;
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