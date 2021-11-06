package ip.syssrc.conditional;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211059 - Muhammad Erwin Arif <muherwinarif31@gmail.com>
 *
 */
public class Cashier {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalBelanja, totalBayar, totalKembalian;
        
        try {
            System.out.print("Berapa harga total belanja anda ? ");
            totalBelanja = scan.nextInt();
            System.out.print("Berapa total uang yang anda bayarkan ? ");
            totalBayar= scan.nextInt();
            scan.close();
        } catch (InputMismatchException e) {
            System.out.print("Maaf, pastikan inputan anda adalah angka");
            return;
        }

        /* operasi menghitung pecahan*/
        if (totalBayar > totalBelanja) {
            totalKembalian = totalBayar - totalBelanja;
            System.out.println();
            System.out.println("Total kembalian anda: Rp " + totalKembalian);
            System.out.println("Dengan rincian sebagai berikut:");
            System.out.println();

            if (totalKembalian >= 100000) {
                int pecahan = (totalKembalian / 100000);
                totalKembalian -= (100000 * pecahan);
                System.out.println(pecahan + " lembar uang Rp. 100.000");
            }
            if (totalKembalian >= 50000) {
                int pecahan = (totalKembalian / 50000);
                totalKembalian -= (50000 * pecahan);
                System.out.println(pecahan + " lembar uang Rp. 50.000");
            }
            if (totalKembalian >= 20000) {
                int pecahan = (totalKembalian / 20000);
                totalKembalian -= (20000 * pecahan);
                System.out.println(pecahan + " lembar uang Rp. 20.000");
            }
            if (totalKembalian >= 10000) {
                int pecahan = (totalKembalian / 10000);
                totalKembalian -= (10000 * pecahan);
                System.out.println(pecahan + " lembar uang Rp. 10.000");
            }
            if (totalKembalian >= 5000) {
                int pecahan = (totalKembalian / 5000);
                totalKembalian -= (5000 * pecahan);
                System.out.println(pecahan + " lembar uang Rp. 5.000");
            }
            if (totalKembalian >= 2000) {
                int pecahan = (totalKembalian / 2000);
                totalKembalian -= (2000 * pecahan);
                System.out.println(pecahan + " lembar uang Rp. 2.000");
            }
            if (totalKembalian >= 1000) {
                int pecahan = (totalKembalian / 1000);
                totalKembalian -= (1000 * pecahan);
                System.out.println(pecahan + " lembar uang Rp. 1.000");
            }
            if (totalKembalian >= 500) {
                int pecahan = (totalKembalian / 500);
                totalKembalian -= (500 * pecahan);
                System.out.println(pecahan + " buah uang Rp. 500");
            }
            if (totalKembalian >= 200) {
                int pecahan = (totalKembalian / 200);
                totalKembalian -= (200 * pecahan);
                System.out.println(pecahan + " buah uang Rp. 200");
            }
            if (totalKembalian >= 100) {
                int pecahan = (totalKembalian / 100);
                totalKembalian -= (100 * pecahan);
                System.out.println(pecahan + " buah uang Rp. 100");
            } 
            if (totalKembalian > 0) {
                System.out.println("Dan sebanyak Rp. " + totalKembalian + " didonasikan");
            }

            
        } else if (totalBayar < totalBelanja) {
            System.out.println("Maaf, pembayaran anda belum mencukupi");
        } else {
            System.out.println("Terima kasih telah membayar dengan uang pas");
        }

    }
}

    
        
    

           
    
    

