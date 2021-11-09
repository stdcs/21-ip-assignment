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
        int sum = 0;
        int sumFinal = 0;

        for (int index = 0; index < (arr.length / 3); index++) {
            System.out.print(arr[index] + " + " + arr[index + (arr.length / 3)] + " + " + arr[index + (arr.length - (arr.length / 3))]);

            sum = arr[index] + arr[index + (arr.length / 3)] + arr[index + (arr.length - (arr.length / 3))];
            sumFinal = sumFinal + arr[index] + arr[index + (arr.length / 3)] + arr[index + (arr.length - (arr.length / 3))];

            System.out.printf(" = %d%s", sum, "\n");
        }


        //print sumFinal
        System.out.print("Sum of ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }

        System.out.print(" = " + sumFinal);

        

    }
}
