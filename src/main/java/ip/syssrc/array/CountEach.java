package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211076 - Hasan Azyumardi Azra <hasanazyumardiazra@gmail.com>
 *
 */
import java.util.Scanner;
public class CountEach {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int[] numbers;
        int[] frequency;
        int included = -1;

        try {
            n = in.nextInt();
            numbers = new int[n];
            frequency = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = in.nextInt();
            }
            in.close();
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