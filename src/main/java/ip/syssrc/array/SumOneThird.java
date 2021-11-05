package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211080 - Dirgantry Leonard Nugrah Boro
 *         <dirgantryleonardnugrahboro@gmail.com>
 *
 */

public class SumOneThird {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        int sum = 0;
        for (int index = 0; index < (arr.length / 3); index++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                int deret = index + (j * (arr.length / 3));
                sum = sum + arr[deret];
                if (j == 2) {
                    System.out.println(arr[deret] + " = " + sum);
                    ;
                } else {
                    System.out.print(arr[deret] + " + ");
                }
                if (index == (arr.length / 3) - 1 && j == 2) {
                    sum = 0;
                    for (int k = ++deret; k < arr.length; k++) {
                        sum += arr[k];
                        System.out.printf("%d%s", arr[k], (k != arr.length - 1) ? " + " : " = " + sum + "\n");
                    }
                }
            }
        }
        System.out.print("Sum of ");
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println(" = " + sum);
    }
}