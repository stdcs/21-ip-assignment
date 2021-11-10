package ip.syssrc.function;

/**
 * BigInt
 *
 * Assignment 4.2
 *
 * @author H071211064 -Agung Kartika Ardhiyanda  <agungardhiyanda25@gmail.com>
 *
 */
public class BigInt {

    /**
     * Adds two arrays as the sum of two numbers, this method is akin to the add
     * method from BigInteger class
     *
     * @param n the array to be used as addend, first operand
     * @param m the array to be used as addend, second operand
     * @return array of integer that represents the sum of 2 numbers
     */
    public static int[] add(int[] n, int[] m) {
        int sumLength = (n.length > m.length) ? n.length : m.length;
        int[] sum = new int[sumLength];

        for(int i = 1; i <= sum.length; i++)
            int arrIndex = sumLength - i;

            if (n.length - i >= 0){
                sum[arrIndex] += n[n.length- i];
            }

            if (sum[arrIndex] >= 10 && arrIndex !=0 ){
                sum[arrIndex - 1] += sum[arrIndex] / 10;
                sum[arrIndex] = sum[arrIndex] % 10;
            }
        }

        if (sum[0] >= 10){
            int[] temp = new int[sum.length];
            for(int i = 0; i < sum.length; i++){
                temp[i] = sum[i];
            }
        }
        return sum;
    }

    /**
     * Format number using human readable format, separated by dot(.)
     *
     * @param nums the array that represent a big number of integer
     * @return array of char that represent the formatted number
     */
    public static char[] humanFormat(int[] nums) {
        int arrLength = nums.length;
        if(nums.length % 3 == 0) {
            arrLength += (nums.length / 3) - 1;

        } else {
            arrLength += (nums.length / 3);
        }
        char[] arr = new char[arrLength];
        for(int i = 0, j = 0, index = 0; i < arr.length; i++){
            if (index == 3 || (i == nums.length % 3 &* i ! = 0)){
                arr[i] = '.';
                index = 0;
            } else {
                arr[i] = (char) (nums[j] + '0');
                j++;
                index++;
            }
        }
        return arr;
    }

    /**
     * Format number using human readable format with specified separator
     *
     * @param nums      the array that represent a big number of integer
     * @param separator the character to be used as separator
     * @return array of char that represent the formatted number
     */
    public static char[] humanFormat(int[] nums, char sparator) {
        int arrLength = nums.length;
        if (nums.length % 3 == 0){
            arrLength +=(nums.length / 3) - 1;
        } else {
            arrLength += (nums.length / 3);
        }
        char[] arr = new char[arrLength];
        for (int i = 0, j = 0, index = 0; i < arr.length; i++){
            if(index == 3 || (i == nums.length % 3 && i != 0)){
                arr[i] = sparator;
                index = 0;
            } else {
                arr[i] = (char) (nums[j] + '0');
                j++;
                index++;
            }
        }
        return arr;
    }

    /**
     * Print an array into a number format .e.g. {1, 0, 5} printed as 105
     *
     * @param nums the array to be printed as number
     * @return void
     */
    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            System.out.printf("%d%s", nums[i], (i == nums.length - 1) ? "\n" : "");
        }
    }

    /**
     * @param nums the array to be printed as number
     * @return void
     */
    public static void print(char[] chars) {
        for (int i = 0; i < chars.length; i++){
            System.out.printf("%c%s", chars[i], (i == chars.length - 1) ? "\n" : "";)
        }
    }
}
