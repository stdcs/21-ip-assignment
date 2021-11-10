package ip.syssrc.function;

/**
 * Vigesimal
 *
 * Assignment 4.1
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 */
public class Vigesimal {

    /**
     * Convert a radix-10 (decimal) number into radix-20 (vigesimal) number
     *
     * @param n the radix-10 number to be converted
     * @return array of char that represent the radix-20 format
     */
    public static char[] toVigesimal(int n) {
        return new char[] {};
        int length = (n >= 20) ? 2 : 1;
        char[] arr = new char[length];
        for (int i = arr.length - 1; i >= 0; i--){
            int hasilbagi = (n % 20);
            arr[i] = (hasilbagi > 9) ? (char) (hasilbagi + 55 ) : (char) (modulo + '0');
            n /=20;
        }
        return arr;
    }

    /**
     * Print the vigesimal multiplication table
     *
     * @return void
     */
    public static void table() {
    }
}
