package ip.syssrc.conditional;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211061 - St. Alya Ardani Aries <stalyaardaniaries@gmail.com>
 *
 */
public class Cashier {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalBelanja = 0;
        int pembayaran = 0;

        try {
            System.out.print("Berapa total harga belanja Anda? ");
            totalBelanja = in.nextInt();
            System.out.print("Berapa total uang yang Anda bayarkan? ");
            pembayaran = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Maaf, pastikan inputan Anda adalah angka");
            in.close();
            return;
        }

        if (totalBelanja == pembayaran) {
            System.out.println("Terima kasih telah membayar dengan uang pas");
        } else if (pembayaran < totalBelanja) {
            System.out.println("Maaf, pembayaran Anda belum mencukupi");   
        }
    }
}
