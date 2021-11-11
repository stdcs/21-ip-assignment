package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211065 - Asehpryanto Rari Parinding <Asehpryantorari@gmail.com>
 *
 */
import java.util.Scanner;
public class Cashier {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int kembalian = 0;
        int totalBelanja = 0;
        int pembayaran = 0;

        try {
            System.out.println("Berapa total harga belanja anda ? ");

            totalBelanja = In.nextInt();

            System.out.println("Berapa total uang anda bayarkan ? ");

            pembayaran = In.nextInt();
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
        }
            if (totalBelanja > pembayaran) {
                System.out.println("Uang Anda Kurang");
            } else {
                kembalian = pembayaran - totalBelanja;
                System.out.println("Total kembalian anda = " + kembalian);
                System.out.println("Dengan dengan rincian sebagai berikut :");
                int UangA,UangB,UangC,UangD,UangE,UangF,UangG,UangH,UangI,UangJ;
                UangA = 0;
                UangB = 0;
                UangC = 0;
                UangD = 0;
                UangE = 0;
                UangF = 0;
                UangG = 0;
                UangH = 0;
                UangI = 0;
                UangJ = 0;
                if (kembalian >= 100000) {
                    int pecahan = (kembalian / 100000);
                    UangA = pecahan;
                    kembalian -= (100000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 100.000");
                }
                if (kembalian >= 50000) {
                    int pecahan = (kembalian / 50000);
                    UangB = pecahan;
                    kembalian -= (50000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 50.000");
                }
                if (kembalian >= 20000) {
                    int pecahan = (kembalian / 20000);
                    UangC = pecahan;
                    kembalian -= (20000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 20.000");
                }
                if (kembalian >= 10000) {
                    int pecahan = (kembalian / 10000);
                    UangD = pecahan;
                    kembalian -= (10000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 10.000");
                }
                if (kembalian >= 5000) {
                    int pecahan = (kembalian / 5000);
                    UangE = pecahan;
                    kembalian -= (5000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 5000");
                }   
                if (kembalian >= 2000) {
                    int pecahan = (kembalian / 2000);
                    UangF = pecahan;
                    kembalian -= (2000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 2000");
                }
                if (kembalian >= 1000) {
                    int pecahan = (kembalian / 1000);
                    UangG = pecahan;
                    kembalian -= (1000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 1000");
                }
                if (kembalian >= 500) {
                    int pecahan = (kembalian / 500);
                    UangH = pecahan;
                    kembalian -= (500 * pecahan);
                    System.out.println(pecahan + " buah uang Rp. 500");
                }
                if (kembalian >= 200) {
                    int pecahan = (kembalian / 200);
                    UangI = pecahan;
                    kembalian -= (200 * pecahan); 
                    System.out.println(pecahan + " buah uang Rp. 200");
                }
                if (kembalian >= 100) {
                    int pecahan = (kembalian / 100);
                    UangJ = pecahan;
                    kembalian -= (100 * pecahan);
                    System.out.println(pecahan + " buah uang Rp. 100");
                }
            }          
        In.close();
    }
}
