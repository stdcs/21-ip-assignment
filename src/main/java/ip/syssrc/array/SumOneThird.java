package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211074 - Wd. Ananda Lesmono <nandalesmono@gmail.com>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int sum = 0;
        int sumWithOneThirdLength = 0;
        
        for (int index = 0; index < (arr.length / 3); index++) {
            System.out.print(arr[index] + " + " + arr[index + (arr.length / 3)] + " + " + arr[index + (arr.length - (arr.length / 3))]);

            sum = arr[index] + arr[index + (arr.length / 3)] + arr[index + (arr.length - (arr.length / 3))];
            sumWithOneThirdLength = sumWithOneThirdLength + arr[index] + arr[index + (arr.length / 3)] + arr[index + (arr.length - (arr.length / 3))];

            System.out.printf(" = %d%s", sum, "\n");
        }
        
        System.out.print("\nSum of ");
        for (int index = 0; index < arr.length; index++) {
            System.out.print("[" + arr[index] + "]");
            sum += arr[index];
        }
        System.out.println(" = " + sum);
    }
}
