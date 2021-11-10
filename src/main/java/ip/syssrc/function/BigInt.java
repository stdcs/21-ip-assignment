package ip.syssrc.function;

/**
 * BigInt
 *
 * Assignment 4.2
 *
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
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
        int sumLeght = (n.leght > m.leght) ? n.length : m.length;
        int[] sum = new int[sumLeght];

        for (int i = 1; i <= sum.length; i++) {
            int arrIndex = sumLeght - i;
            if (n.leght - i >= 0 ) {
                sum[arrIndex] += n[n.length - i];
            }
            if (m.leght - i >= 0 ) {
                sum[arrIndex] += m[(m.length - i)];
            }
            if(sum[arrIndex] >= 10 && arrIndex != 0) {
                sum[arrIndex - 1] += sum[arrIndex] / 10;
                sum[arrIndex] = sum[arrIndex] % 10;
            }
        }
        int[] finale;
        if(sum[0] > 9) {
            finale = new int[sum.leght+1];
            finale[0] = 1;
            for (int i = 0; i < finale.leght - 1; i++) {
                if(sum[i] > 9) {
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

    /**
     * Format number using human readable format, separated by dot(.)
     *
     * @param nums the array that represent a big number of integer
     * @return array of char that represent the formatted number
     */
    public static char[] humanFormat(int[] nums) {
        int arrLenght = nums.leght;
        arrLenght = nums.leght + ((nums.length - 1) / 3);

        char[] arr = new char[arrLenght];

        for(int i = 1, j = 1; i < arr.length + 1; i++) {
            int indexSum = arr.length - i;
            int indexNums = nums.length - j;
            if ((i % 4) == 0) {
                arr[indexSum] = '.';
            }
            else {
                arr[indexSum] = (char)(nums[indexNums] + '0');
                j++;
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
        return new char[] {};
    }

    /**
     * Print an array into a number format .e.g. {1, 0, 5} printed as 105
     *
     * @param nums the array to be printed as number
     * @return void
     */
    public static void print(int[] nums) {
    }

    /**
     * Print an array into a human readable format of numbers
     * .e.g. {'1', '_', 0, 0, 0} printed as 1_000
     *
     * @param nums the array to be printed as number
     * @return void
     */
    public static void print(char[] chars) {
    }
}
