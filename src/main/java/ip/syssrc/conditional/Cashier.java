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
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            g = 0;
            h = 0;
            i = 0;
            j = 0;

            if (kembalian >= 100000) {
                kembalian = kembalian - 100000;
                a = a + 1;
            }
            if (kembalian >= 50000) {
                kembalian = kembalian - 50000;
                b = b + 1;
            }
            if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                c = c + 1;
            }
            if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                c = c + 1;
            }
            if (kembalian >= 10000) {
                kembalian = kembalian - 10000;
                d = d + 1;
            }
            if (kembalian >= 5000) {
                kembalian = kembalian - 5000;
                e = e + 1;
            }
            if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                f = f + 1;
            }
            if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                f = f + 1;
            }
            if (kembalian >= 1000) {
                kembalian = kembalian - 1000;
                g = g + 1;
            }
            if (kembalian >= 500) {
                kembalian = kembalian - 500;
                h = h + 1;
            }
            if (kembalian >= 200) {
                kembalian = kembalian - 200;
                i = i + 1;
            }
            if (kembalian >= 200) {
                kembalian = kembalian - 200;
                i = i + 1;
            }
            if (kembalian >= 100) {
                kembalian = kembalian - 100;
                j = j + 1;
            }

            if (a > 0) {
                System.out.println(a + " lembar uang Rp. 100000");
            }
            if (b > 0) {
                System.out.println(b + " lembar uang Rp. 50000");
            }
            if (c > 0) {
                System.out.println(c + " lembar uang Rp. 20000");
            }
    }
}
