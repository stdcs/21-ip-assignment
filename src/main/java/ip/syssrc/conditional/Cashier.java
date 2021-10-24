package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071121080- Dirgantry leonard Nugrah Boro <dirgantryleonardnugrahboro@gmail.com>
 *
 */
import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        try {

            System.out.println("jumlahuang = ");
            a = scan.nextInt();

            System.out.println("harga = ");
            b = scan.nextInt();
            System.out.println("kembalian = ");
            c = a - b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("maaf pastikan inputan anda adalah angka");
        }

        int bil1;

        // besar 100000
        if (c >= 100000) {
            bil1 = c / 100000;
            System.out.println(" uang Rp 100000 sebanyak " + bil1 + "lembar");
        }

        // antara 50000-100000
        c = c % 100000;
        if ((c >= 50000) && (c < 100000)) {
            bil1 = c / 50000;
            System.out.println("uang Rp 50000 sebanyak " + bil1 + "lembar");
        }

        // antara 20000-50000
        c = c % 50000;
        if ((c >= 20000) && (c < 50000)) {
            bil1 = c / 20000;
            System.out.println("uang Rp  20000 sebanyak " + bil1 + "lembar");
        }

        // antara 10000-20000
        c = c % 20000;
        if ((c >= 10000) && (c < 20000)) {
            bil1 = c / 10000;
            System.out.println(" uang Rp  10000 sebanyak " + bil1 + "lembar");
        }

        // antara 5000-10000
        c = c % 10000;
        if ((c >= 5000) && (c < 10000)) {
            bil1 = c / 5000;
            System.out.println(" uang Rp   5000 sebanyak " + bil1 + "lembar");
        }

        // antara 2000-5000
        c = c % 5000;
        if ((c >= 2000) && (c < 5000)) {
            bil1 = c / 2000;
            System.out.println(" uang Rp   2000 sebanyak " + bil1 + "lembar");
        }

        // antara 1000-2000
        c = c % 2000;
        if ((c >= 1000) && (c < 2000)) {
            bil1 = c / 1000;
            System.out.println("uang Rp   1000 sebanyak " + bil1 + "lembar");
        }

        // antara 500-1000
        c = c % 1000;
        if ((c >= 500) && (c < 1000)) {
            bil1 = c / 500;
            System.out.println(" uang Rp    500 sebanyak " + bil1 + "buah");
        }

        // antara 200-500
        c = c % 500;
        if ((c >= 200) && (c < 500)) {
            bil1 = c / 200;
            System.out.println(" uang Rp    200 sebanyak " + bil1 + "buah");
        }

        // antara 100-200
        c = c % 200;
        if ((c >= 100) && (c < 200)) {
            bil1 = c / 100;
            System.out.println(" uang Rp    100 sebanyak " + bil1 + "buah");
        }

        // antara 50-100
        c = c % 100;
        if ((c >= 50) && (c < 100)) {
            bil1 = c / 50;
            System.out.println("uang Rp     50 sebanyak " + bil1 + "buah");
        }

        // kurang 50
        c = c % 50;
        if ((c > 0) && (c < 50)) {
            bil1 = c;
            // satuan
            if (bil1 < 10)
                System.out.println("Rp      " + bil1 + " di donasikan");
            else if (bil1 >= 10)// puluhan
                System.out.println("Rp     " + bil1 + " di donasikan");
        }

    }
}
