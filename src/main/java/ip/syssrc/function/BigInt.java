package ip.syssrc.function;
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> f98dc4b (delete)

<<<<<<< HEAD
<<<<<<< HEAD
=======
import javax.swing.JPopupMenu.Separator;

>>>>>>> eea20b5 (feat(function/BigInt): add code)
=======
import javax.swing.JPopupMenu.Separator;

>>>>>>> eea20b5 (feat(function/BigInt): add code)
<<<<<<< HEAD
>>>>>>> 1ae828f (delete)
=======
=======
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
/**
 * BigInt
 *
 * Assignment 4.2
 *
<<<<<<< HEAD
<<<<<<< HEAD
 * @author H071211074 - Wd. Ananda Lesmono <nandalesmono@gmail>
=======
<<<<<<< HEAD
<<<<<<< HEAD
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
=======
=======
>>>>>>> f98dc4b (delete)
 * @author H071211074 - Wd. Ananda Lesmono <nandalesmono@gmail>
<<<<<<< HEAD
>>>>>>> eea20b5 (feat(function/BigInt): add code)
=======
 * @author H071211074 - Wd. Ananda Lesmono <nandalesmono@gmail>
>>>>>>> eea20b5 (feat(function/BigInt): add code)
<<<<<<< HEAD
>>>>>>> 1ae828f (delete)
=======
=======
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> eea20b5 (feat(function/BigInt): add code)
<<<<<<< HEAD
>>>>>>> 1ae828f (delete)
=======
=======
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
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
            for (int i = 0 ; i < finale.length-1; i++) {
                if (sum[i] > 9) {
                    sum[i] %= 10;
                }
                finale[i + 1] = sum[i];
            }
<<<<<<< HEAD
<<<<<<< HEAD
        } else {
            finale = sum;
        }
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> f98dc4b (delete)
>>>>>>> eea20b5 (feat(function/BigInt): add code)
=======
        }
        else {
=======
        } else {
>>>>>>> bf1cbd2 (fix(function/BigInt): delete some space)
            finale = sum;
        }
>>>>>>> eea20b5 (feat(function/BigInt): add code)
<<<<<<< HEAD
>>>>>>> 1ae828f (delete)
=======
=======
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
        return new int[] {};
    }

    /**
     * Format number using human readable format, separated by dot(.)
     *
     * @param nums the array that represent a big number of integer
     * @return array of char that represent the formatted number
     */
    public static char[] humanFormat(int[] nums) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> eea20b5 (feat(function/BigInt): add code)
<<<<<<< HEAD
>>>>>>> 1ae828f (delete)
=======
=======
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
        int arrLength = nums.length;
        arrLength = nums.length + ((nums.length - 1) / 3);

        char[] arr = new char[arrLength];

        for (int i = 1, j = 1 ; i < arr.length+1; i++) {
            int indexSum = arr.length - i;
            int indexNums = nums.length - j;
            if ((i % 4) == 0) {
                arr[indexSum] = '.';
<<<<<<< HEAD
<<<<<<< HEAD
            } else {
=======
            }
            else {
>>>>>>> eea20b5 (feat(function/BigInt): add code)
=======
            } else {
>>>>>>> bf1cbd2 (fix(function/BigInt): delete some space)
                arr[indexSum] = (char) (nums[indexNums]+'0');
                j++;
            } 
        }
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> f98dc4b (delete)
<<<<<<< HEAD
>>>>>>> eea20b5 (feat(function/BigInt): add code)
=======
>>>>>>> eea20b5 (feat(function/BigInt): add code)
<<<<<<< HEAD
>>>>>>> 1ae828f (delete)
=======
=======
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
        return new char[] {};
    }

    /**
     * Format number using human readable format with specified separator
     *
     * @param nums      the array that represent a big number of integer
     * @param separator the character to be used as separator
     * @return array of char that represent the formatted number
     */
    public static char[] humanFormat(int[] nums, char sparator) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> eea20b5 (feat(function/BigInt): add code)
<<<<<<< HEAD
>>>>>>> 1ae828f (delete)
=======
=======
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
        int arrLength = nums.length;
        arrLength = nums.length + ((nums.length - 1) / 3);

        char[] arr = new char[arrLength];

        for (int i = 1, j = 1 ; i < arr.length+1; i++) {
            int indexSum = arr.length - i;
            int indexNums = nums.length - j;
            if ((i % 4) == 0) {
                arr[indexSum] = sparator;
<<<<<<< HEAD
<<<<<<< HEAD
            } else {
=======
            }
            else {
>>>>>>> eea20b5 (feat(function/BigInt): add code)
=======
            } else {
>>>>>>> bf1cbd2 (fix(function/BigInt): delete some space)
                arr[indexSum] = (char) (nums[indexNums] + '0');
                j++;
            } 
        }
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> f98dc4b (delete)
<<<<<<< HEAD
>>>>>>> eea20b5 (feat(function/BigInt): add code)
=======
>>>>>>> eea20b5 (feat(function/BigInt): add code)
<<<<<<< HEAD
>>>>>>> 1ae828f (delete)
=======
=======
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
        return new char[] {};
    }

    /**
     * Print an array into a number format .e.g. {1, 0, 5} printed as 105
     *
     * @param nums the array to be printed as number
     * @return void
     */
    public static void print(int[] nums) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> f98dc4b (delete)
        for (int i : nums) {
            System.out.println(i);
        }
<<<<<<< HEAD
>>>>>>> eea20b5 (feat(function/BigInt): add code)
=======
<<<<<<< HEAD
>>>>>>> 1ae828f (delete)
        for (int i : nums) {
            System.out.println(i);
        }
=======
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
    }

    /**
     * Print an array into a human readable format of numbers
     * .e.g. {'1', '_', 0, 0, 0} printed as 1_000
     *
     * @param nums the array to be printed as number
     * @return void
     */
    public static void print(char[] chars) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> f98dc4b (delete)
        for (char i : chars) {
            System.out.println(i);
        }
<<<<<<< HEAD
>>>>>>> eea20b5 (feat(function/BigInt): add code)
=======
<<<<<<< HEAD
>>>>>>> 1ae828f (delete)
        for (char i : chars) {
            System.out.println(i);
        }
=======
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
    }
}
