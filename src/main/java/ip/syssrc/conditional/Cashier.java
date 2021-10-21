package ip.syssrc.conditional;
import java.util.Scanner; 
/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211079 - Dhiyaa Unnisa <unnisadhiyaa25@gmail.com>
 *
 */
public class Cashier {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Berapa total harga belanja Anda? ");
        int totalBelanja = in.nextInt();

        System.out.print("Berapa total uang yang Anda bayarkan? ");
        int pembayaran = in.nextInt();
    }
}
