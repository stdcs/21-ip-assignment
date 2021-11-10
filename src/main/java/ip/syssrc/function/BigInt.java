package ip.syssrc.function;

/**
 * BigInt
 *
 * Assignment 4.2
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
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
        int jumlahPanjang = (n.length > m.length) ? n.length : m.length;
        int[] jumlah = new int[jumlahPanjang];

        for(int i = 1; i <= jumlah.length; i++)
            int arrIndex = jumlahPanjang - i;

            if (n.length - i >= 0){
                jumlah[arrIndex] += n[n.length - i];
            }

            if (sum[arrIndex] >= 10 && arrIndex !=0 ){
                jumlah[arrIndex - 1] += jumlah[arrIndex] / 10;
                jumlah[arrIndex] = jumlah[arrIndex] % 10;
            }
    }

        if (jumlah[0] >= 10){
            int[] temp = new int[jumlah.length];
            for(int i = 0; i < sum.length; i++){
                temp[i] = sum[i];
            }
        }

    /**
     * Format number using human readable format, separated by dot(.)
     *
     * @param nums the array that represent a big number of integer
     * @return array of char that represent the formatted number
     */
    public static char[] humanFormat(int[] nums) {
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
