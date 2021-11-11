package ip.syssrc.function;

/**
 * BigInt
 *
 * Assignment 4.2
 *
 * @author H071211053 - Aditya Erlangga Bagaskara <aditya.erlangga0206@gmail.com>
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class BigInt {
    public static void main(String[] args) {
        int[] a = {2,3,4,5};
        int[] b = {9,4,6,9};
        System.out.println();
        for (char i:humanFormat(a)) {
            System.out.print(i);
        }
    }

    public static int[] add(int[] n, int[] m) {
        int sumLength = (n.length > m.length) ? n.length : m.length;
        int[] sum = new int[sumLength];

        for (int i = 1; i <= sum.length; i++) {
            int arrIndex = sumLength - i;

            if (n.length - i >= 0) {
                sum[arrIndex] += n[n.length - i];
            }

            if (m.length - i >= 0) {
                sum[arrIndex] += m[(m.length - i)];
            }

            if (sum[arrIndex] >= 10 && arrIndex != 0) {
                sum[arrIndex - 1] += sum[arrIndex] / 10;
                sum[arrIndex] = sum[arrIndex] % 10;
            }
        }

        int [] finale;
        if (sum[0] > 9){
            finale = new int[sum.length + 1];
            finale[0] = 1;
            for (int i = 0 ;i < finale.length-1; i++) {
                if (sum[i] > 9) {
                    sum[i] %= 10;
                }
                finale[i+1] = sum[i];
            }
        }
        else {
            finale = sum;
        }
        return finale;
    }

    public static char[] humanFormat(int[] nums) {
        int arrLength = nums.length;
        arrLength = nums.length + ((nums.length - 1) / 3);

        char[] arr = new char[arrLength];

        for (int i = 1, j = 1 ; i < arr.length+1; i++) {
            int indexSum = arr.length - i;
            int indexNums = nums.length - j;
            if ((i % 4) == 0) {
                arr[indexSum] = '.';
            }
            else {
                arr[indexSum] = (char)(nums[indexNums]+'0');
                j++;
            } 
        }

        return arr;
    }
}