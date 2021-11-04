package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211060 - Andi Muh. Ibnu Hibban Bagoes Malolo <andibagoes1412@gmail.com>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < (arr.length / 3); i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++ ) {
                int arithmetic = arr.length / 3;
                int deret = i + (j * arithmetic);
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
            for (int i = ((arr.length / 3) * 3); i < arr.length; i++) {
                sum = sum + arr[i];
                if (i == arr.length - 1) {
                    System.out.print(arr[i] + " = " + sum);
                } else {
                    System.out.print(arr[i] + " + ");
                }
            }
        } 
        System.out.print("\nsum of ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
            sum += arr[i];
        }
        System.out.println(" = " + sum);        
        
    }
}
