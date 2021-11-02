package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211041 - Fathur Rachman Alamsyah <sembarangm135@gmail.com>
 *
 */
import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {
        Scanner mart = new Scanner(System.in);
        int kembalian = 0;
        int totalBelanja = 0;
        int pembayaran = 0;

        try {

            System.out.println("Berapa total harga belanja anda ? ");

            totalBelanja = mart.nextInt();

            System.out.println("Berapa total uang anda bayarkan ? ");

            pembayaran = mart.nextInt();
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
        }

        if (totalBelanja > pembayaran) {
            System.out.println("Uang Anda Kurang");
        } else {
            kembalian = pembayaran - totalBelanja;
            System.out.println("Total kembalian anda = " + kembalian);
            System.out.println("Dengan dengan rincian sebagai berikut :");

            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            int f = 0;
            int g = 0;
            int h = 0;
            int i = 0;
            int j = 0;

            if (kembalian >= 100000) {
                kembalian = kembalian - 100000;
                a++;
            }
            if (kembalian >= 50000) {
                kembalian = kembalian - 50000;
                b++;
            }
            if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                c++;
            }
            if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                c++;
            }
            if (kembalian >= 10000) {
                kembalian = kembalian - 10000;
                d++;
            }
            if (kembalian >= 5000) {
                kembalian = kembalian - 5000;
                e++;
            }
            if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                f++;
            }
            if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                f++;
            }
            if (kembalian >= 1000) {
                kembalian = kembalian - 1000;
                g++;
            }
            if (kembalian >= 500) {
                kembalian = kembalian - 500;
                h++;
            }
            if (kembalian >= 200) {
                kembalian = kembalian - 200;
                i++;
            }
            if (kembalian >= 200) {
                kembalian = kembalian - 200;
                i++;
            }
            if (kembalian >= 100) {
                kembalian = kembalian - 100;
                j++;
            }
            if (a > 0) {
                System.out.println(a + " lembar uang Rp.100000");
            }
            if (b > 0) {
                System.out.println(b + " lembar uang Rp.50000");
            }
            if (c > 0) {
                System.out.println(c + " lembar uang Rp.20000");
            }
            if (d > 0) {
                System.out.println(d + " lembar uang Rp.10000");
            }
            if (e > 0) {
                System.out.println(e + " lembar uang Rp.5000");
            }
            if (f > 0) {
                System.out.println(f + " lembar uang Rp.2000");
            }
            if (g > 0) {
                System.out.println(g + " lembar uang Rp.1000");
            }
            if (h > 0) {
                System.out.println(h + " buah uang Rp.500");
            }
            if (i > 0) {
                System.out.println(i + " buah uang Rp.200");
            }
            if (j > 0) {
                System.out.println(j + " buah uang Rp.100");
            }
            if (kembalian > 0) {
                System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
            }

        }
        mart.close();
    }
}
