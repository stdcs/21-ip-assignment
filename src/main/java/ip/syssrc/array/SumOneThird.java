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
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 100 };

        
        for (int index = 0; index < (arr.length / 3); index++) {
            int sum = 0;
            for (int j = 0; j < 3; j++ ) {
                int aritmatika = arr.length / 3;
                int deret = index + (j * aritmatika);
                sum = sum + arr[deret];
                if (j == 2) {
                    System.out.println(arr[deret] + " = " + sum);;
                } else {
                    System.out.print(arr[deret] + " + ");
                }
            }
        }
        if (arr.length % 3 > 0) {
            int sum = 0;
            for (int index = ((arr.length / 3) * 3); index < arr.length; index++) {
                sum = sum + arr[index];
                if (index == arr.length - 1) {
                    System.out.print(arr[index] + " = " + sum);
                } else {
                    System.out.print(arr[index] + " + ");
                }
            }
        } 
        System.out.print("\nsum of ");
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            System.out.print("[" + arr[index] + "]");
            sum += arr[index];
        }
        System.out.println(" = " + sum);
    }
}
