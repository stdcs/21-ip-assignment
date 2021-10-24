package ip.syssrc.conditional;
import java.util.Scanner;
/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211052 - MUHAMMAD ARYA RAMDANI <muhammadaryaramdani@gmail.com>
 *
 */
public class Cashier {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);
        System.out.println("Berapa total harga belanja anda ? ");
        try {
            int totalBelanja = In.nextInt();
        
            System.out.println("Berapa total uang anda bayarkan ? ");
    
            int pembayaran = In.nextInt();
    
            if (totalBelanja > pembayaran) {
                System.out.println("Uang Anda Kurang");
            } else {
                int kembalian = pembayaran - totalBelanja;
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
                    kembalian = kembalian - 100000;
                    UangA = UangA + 1;
                }
                if (kembalian >= 50000) {
                    kembalian = kembalian - 50000;
                    UangB = UangB + 1;
                }
                if (kembalian >= 20000) {
                    kembalian = kembalian - 20000;
                    UangC = UangC + 1;
                }
                if (kembalian >= 20000) {
                    kembalian = kembalian - 20000;
                    UangC = UangC + 1;
                }
                if (kembalian >= 10000) {
                    kembalian = kembalian - 10000;
                    UangD = UangD + 1;
                }
                if (kembalian >= 5000) {
                    kembalian = kembalian - 5000;
                    UangE = UangE + 1;
                }   
                if (kembalian >= 2000) {
                    kembalian = kembalian - 2000;
                    UangF = UangF + 1;
                }
                if (kembalian >= 2000) {
                    kembalian = kembalian - 2000;
                    UangF = UangF + 1;
                }
                if (kembalian >= 1000) {
                    kembalian = kembalian - 1000;
                    UangG = UangG + 1;
                }
                if (kembalian >= 500) {
                    kembalian = kembalian - 500;
                    UangH = UangH + 1;
                }
                if (kembalian >= 200) {
                    kembalian = kembalian - 200;
                    UangI = UangI + 1;
                }
                if (kembalian >= 200) {
                    kembalian = kembalian - 200;
                    UangI = UangI + 1;
                }
                if (kembalian >= 100) {
                    kembalian = kembalian - 100;
                    UangJ = UangJ + 1;
                }
                if (UangA > 0) {
                    System.out.println(UangA + " lembar uang Rp.100000");
                } 
                if (UangB > 0) {
                    System.out.println(UangB + " lembar uang Rp.50000");
                } 
                if (UangC > 0) {
                    System.out.println(UangC + " lembar uang Rp.20000");
                } 
                if (UangD > 0) {
                    System.out.println(UangD + " lembar uang Rp.10000");
                } 
                if (UangE > 0) {
                    System.out.println(UangE + " lembar uang Rp.5000");
                } 
                if (UangF > 0) {
                    System.out.println(UangF + " lembar uang Rp.2000");
                } 
                if (UangG > 0) {
                    System.out.println(UangG + " lembar uang Rp.1000");
                } 
                if (UangH > 0) {
                    System.out.println(UangH + " buah uang Rp.500");
                } 
                if (UangI > 0) {
                    System.out.println(UangI + " buah uang Rp.200");
                } 
                if (UangJ > 0) {
                    System.out.println(UangJ + " buah uang Rp.100");
                }
                if (kembalian > 0) {
                    System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
                }
                
            }        
        } catch (Exception e){
            System.out.println("maaf, pastikan inputan anda adalah angka");
        }

        
        In.close();
    }
}