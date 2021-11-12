package ip.syssrc.function;

/**
 * Vigesimal
 *
 * Assignment 4.1
 *
 * @author H071211053 - Aditya Erlangga Bagaskara <aditya.erlangga0206@gmail.com>
 */
public class Vigesimal { 
    public static void main(String[] args) {
        table();
    }
    
    public static char[] toVigecimal(int n) {
        int length = (n >= 20) ? 2 : 1;
        char[] arr = new char[length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int modulo = (n % 20);
            arr[i] = (modulo > 9) ? (char) (modulo + 55) : (char) (modulo + '0');
            n /= 20;
        } 
        return arr;

    }
    public static void table() {
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                char[] vigecimal = toVigecimal(i*j);
                String vig = "";
                for(char k:vigecimal) {
                    vig += k;
                }
                System.out.printf("%3s",vig);
            }
            System.out.println("");
        }
    }
}