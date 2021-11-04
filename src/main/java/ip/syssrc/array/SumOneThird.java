package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int sum;
        int aritmatika;

        for (int index = 0; index < (arr.length / 3); index++) {
            sum = 0;
            for (int j = 0; j < 3; j++ ) {
                int deret = i + (j * aritmatika);
                sum = sum + arr[deret];
                if (j == 2) {
                    System.out.println(arr[deret] + " = " + sum);;
                } else {
                    System.out.print(arr[deret] + " + ");
                }
            }
        }

        if (n%3 > 0) {
            sum = 0;
            for (int i = ((n/3) * 3); i < n; i++) {
                sum = sum + arr[i];
                if (i == n-1) {
                    System.out.print(array[i] + " = " + sum);
                } else {
                    System.out.print(array[i] + " + ");
                }
            }
        }

        in.close();

    }
}
