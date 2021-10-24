package ip.syssrc.conditional;
import java.util.Scanner;
/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211078 - Muh Fajar Siddiq (fsiddiq072@gmail.com)
 *
 */
public class Cashier {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Berapa total harga belanja anda ? ");
        int totalBelanja = 0;
        int kembalian = 0;
        int pembayaran = 0;
        try {
            totalBelanja = In.nextInt();
            System.out.println("Berapa total uang anda bayarkan ? ");
                pembayaran = In.nextInt();  
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            //TODO: handle exception
        }

            if (totalBelanja > pembayaran) {
                System.out.println("Uang Anda Kurang");
            } else {
                kembalian = pembayaran - totalBelanja;
                System.out.println("Total kembalian anda = " + kembalian);
                System.out.println("Dengan dengan rincian sebagai berikut :");
                int uangA, uangB, uangC, uangD, uangE, uangF, uangG, uangH, uangI, uangJ;
                uangA = 0;
                uangB = 0;
                uangC = 0;
                uangD = 0;
                uangE = 0;
                uangF = 0;
                uangG = 0;
                uangH = 0;
                uangI = 0;
                uangJ = 0;
    
                if (kembalian >= 100000) {
                    int pecahan = (kembalian / 100000);
                    uangA = pecahan;
                    kembalian -= (100000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 100.000");
                }
                if (kembalian >= 50000) {
                    int pecahan = (kembalian / 50000);
                    uangB = pecahan;
                    kembalian -= (50000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 50.000");
                }
                if (kembalian >= 20000) {
                    int pecahan = (kembalian / 20000);
                    uangC = pecahan;
                    kembalian -= (20000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 20.000");
                }
                if (kembalian >= 10000) {
                    int pecahan = (kembalian / 10000);
                    uangD = pecahan;
                    kembalian -= (10000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 10.000");
                }
                if (kembalian >= 5000) {
                    int pecahan = (kembalian / 5000);
                    uangE = pecahan;
                    kembalian -= (5000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 5000");
                }   
                if (kembalian >= 2000) {
                    int pecahan = (kembalian / 2000);
                    uangF = pecahan;
                    kembalian -= (2000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 2000");
                }
                if (kembalian >= 1000) {
                    int pecahan = (kembalian / 1000);
                    uangG = pecahan;
                    kembalian -= (1000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 1000");
                }
                if (kembalian >= 500) {
                    int pecahan = (kembalian / 500);
                    uangH = pecahan;
                    kembalian -= (500 * pecahan);
                    System.out.println(pecahan + " buah uang Rp. 500");
                }
                if (kembalian >= 200) {
                    int pecahan = (kembalian / 200);
                    uangI = pecahan;
                    kembalian -= (200 * pecahan); 
                    System.out.println(pecahan + " buah uang Rp. 200");
                }
                if (kembalian >= 100) {
                    int pecahan = (kembalian / 100);
                    uangJ = pecahan;
                    kembalian -= (100 * pecahan);
                    System.out.println(pecahan + " buah uang Rp. 100");
                }
        
            }
       
        In.close();
    }
}
