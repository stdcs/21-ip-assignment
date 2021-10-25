package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211073 - Djulizah Bonita L
 *
 */
import java.util.Scanner;
public class Cashier {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int totalBelanja, pembayaran, kembalian;
        pembayaran = 0;
        totalBelanja = 0;

        try {
            System.out.print("Berapa total harga belanja anda ? ");
            totalBelanja = In.nextInt();
            System.out.print("Berapa total uang anda bayarkan ? ");
            pembayaran = In.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            In.close();
            return;
        }
                
        kembalian = pembayaran - totalBelanja;

        if(pembayaran > totalBelanja) {
            System.out.println("Total kembalian anda = " + kembalian);
            System.out.println("Dengan dengan rincian sebagai berikut :");
            System.out.println();

            int jumlah100K, jumlah50K, jumlah20K, jumlah10K, jumlah5K, jumlah2K, jumlah1K, jumlah500, jumlah200, jumlah100;
            jumlah100K = 0;
            jumlah50K = 0;
            jumlah20K = 0;
            jumlah10K = 0;
            jumlah5K = 0;
            jumlah2K = 0;
            jumlah1K = 0;
            jumlah500 = 0;
            jumlah200 = 0;
            jumlah100 = 0;

            if (kembalian >= 100000) {
                kembalian = kembalian - 100000;
                jumlah100K = jumlah100K + 1;
            } if (kembalian >= 50000) {
                kembalian = kembalian - 50000;
                jumlah50K = jumlah50K + 1;
            } if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                jumlah20K = jumlah20K + 1;
            } if (kembalian >= 10000) {
                kembalian = kembalian - 10000;
                jumlah10K = jumlah10K + 1;
            } if (kembalian >= 5000) {
                kembalian = kembalian - 5000;
                jumlah5K = jumlah5K + 1;
            } if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                jumlah2K= jumlah2K + 1;
            } if (kembalian >= 1000) {
                kembalian = kembalian - 1000;
                jumlah1K = jumlah1K + 1;
            } if (kembalian >= 500) {
                kembalian = kembalian - 500;
                jumlah500 = jumlah500 + 1;
            } if (kembalian >= 200) {
                kembalian = kembalian - 200;
                jumlah200 = jumlah200 + 1;
            } if (kembalian >= 100) {
                kembalian = kembalian - 100;
                jumlah100 = jumlah100 + 1;
            }
            
            if (jumlah100K > 0) {
                System.out.println(a + " lembar uang Rp.100000");
            } if (jumlah50K > 0) {
                System.out.println(b + " lembar uang Rp.50000");
            } if (jumlah20K > 0) {
                System.out.println(c + " lembar uang Rp.20000");
            } if (jumlah10K > 0) {
                System.out.println(d + " lembar uang Rp.10000");
            } if (jumlah5K > 0) {
                System.out.println(e + " lembar uang Rp.5000");
            } if (jumlah2K > 0) {
                System.out.println(f + " lembar uang Rp.2000");
            } if (jumlah1K > 0) {
                System.out.println(g + " lembar uang Rp.1000");
            } if (jumlah500 > 0) {
                System.out.println(h + " buah uang Rp.500");
            } if (jumlah200 > 0) {
                System.out.println(i + " buah uang Rp.200");
            } if (jumlah100 > 0) {
                System.out.println(j + " buah uang Rp.100");
            } if (kembalian > 0) {
                System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
            }

        } else if (pembayaran == totalBelanja) {
            System.out.println("Pembayaran yang dilakukan menggunakan uang pas");
        } else
        System.out.println("Uang pembeli belum cukup");
        
        In.close();

    }
}
