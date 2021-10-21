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
        if (totalBelanja == pembayaran) {
            System.out.println("Terima kasih telah membayar dengan uang pas");
        } else if (pembayaran < totalBelanja) {
            System.out.println("Maaf, pembayaran Anda belum mencukupi");   
        } else {
            int kembalian = pembayaran - totalBelanja;
            System.out.println("Total kembalian Anda : " + kembalian);
            System.out.println("Dengan rincian sebagai berikut : ");
            int a,b,c,d,e,f,g,h,i,j;
    }
}
