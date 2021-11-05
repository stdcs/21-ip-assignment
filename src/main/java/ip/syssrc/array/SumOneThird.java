package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211086 - Diza Alysha Zahra <dizalysha@gmail.com>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        for (int index = 0; index < (arr.length / 3); index++) {
            // Your magic is here
            sum = 0;
            for (int j = 0; j < 3; j++ ) {
                int deret = i + (j * aritmatika);
                sum = sum + array[deret];
                if (j == 2) {
                    System.out.println(array[deret] + " = " + sum);;
                } else {
                    System.out.print(array[deret] + " + ");
                }
            }
        }
        if (n%3 > 0) {
            sum = 0;
            for (int i = ((n/3) * 3); i < n; i++) {
                sum = sum + array[i];
                if (i == n-1) {
                    System.out.print(array[i] + " = " + sum);
                } else {
                    System.out.print(array[i] + " + ");
                }
            }
        }
    }
}