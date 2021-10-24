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
        try{
        int totalBelanja = In.nextInt();
        System.out.println("Berapa total uang anda bayarkan ? ");
            int pembayaran = In.nextInt();

            if (totalBelanja > pembayaran) {
                System.out.println("Uang Anda Kurang");
            } else {
                int kembalian = pembayaran - totalBelanja;
                System.out.println("Total kembalian anda = " + kembalian);
                System.out.println("Dengan dengan rincian sebagai berikut :");
                int uangA,uangB,uangC,uangD,uangE,uangF,uangG,uangH,uangI,uangJ;
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
                    kembalian = kembalian - 100000;
                    uangA = uangA + 1;
                }
                if (kembalian >= 100000) {
                    kembalian = kembalian - 100000;
                    uangA = uangA + 1;
                }
                if (kembalian >= 50000) {
                    kembalian = kembalian - 50000;
                    uangB = uangB + 1;
                }
                if (kembalian >= 20000) {
                    kembalian = kembalian - 20000;
                    uangC = uangC + 1;
                }
                if (kembalian >= 20000) {
                    kembalian = kembalian - 20000;
                    uangC = uangC + 1;
                }
                if (kembalian >= 10000) {
                    kembalian = kembalian - 10000;
                    uangD = uangD + 1;
                }
                if (kembalian >= 5000) {
                    kembalian = kembalian - 5000;
                    uangE = uangE + 1;
                }   
                if (kembalian >= 2000) {
                    kembalian = kembalian - 2000;
                    uangF = uangF + 1;
                }
                if (kembalian >= 2000) {
                    kembalian = kembalian - 2000;
                    uangF = uangF + 1;
                }
                if (kembalian >= 1000) {
                    kembalian = kembalian - 1000;
                    uangG = uangG + 1;
                }
                if (kembalian >= 500) {
                    kembalian = kembalian - 500;
                    uangH = uangH + 1;
                }
                if (kembalian >= 200) {
                    kembalian = kembalian - 200;
                    uangI = uangI + 1;
                }
                if (kembalian >= 200) {
                    kembalian = kembalian - 200;
                    uangI = uangI + 1;
                }
                if (kembalian >= 100) {
                    kembalian = kembalian - 100;
                    uangJ = uangJ + 1;
                }
                if (uangA > 0) {
                    System.out.println(uangA + " lembar uang Rp.100000");
                } 
                if (uangB > 0) {
                    System.out.println(uangB + " lembar uang Rp.50000");
                } 
                if (uangC > 0) {
                    System.out.println(uangC + " lembar uang Rp.20000");
                } 
                if (uangD > 0) {
                    System.out.println(uangD + " lembar uang Rp.10000");
                } 
                if (uangE > 0) {
                    System.out.println(uangE + " lembar uang Rp.5000");
                } 
                if (uangF > 0) {
                    System.out.println(uangF + " lembar uang Rp.2000");
                } 
                if (uangG > 0) {
                    System.out.println(uangG + " lembar uang Rp.1000");
                } 
                if (uangH > 0) {
                    System.out.println(uangH + " buah uang Rp.500");
                } 
                if (uangI > 0) {
                    System.out.println(uangI + " buah uang Rp.200");
                } 
                if (uangJ > 0) {
                    System.out.println(uangJ + " buah uang Rp.100");
                }
                if (kembalian > 0) {
                    System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
                }
        
            }
        } catch (Exception e) {
            System.out.println("Maaf, pastikan input anda adalah angka");
            //TODO: handle exception
        }
       
        In.close();
    }
}
