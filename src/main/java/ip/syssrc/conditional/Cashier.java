package ip.syssrc.conditional;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211061 - St. Alya Ardani Aries <stalyaardaniaries@gmail.com>
 *
 */
public class Cashier {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalBelanja = 0;
        int pembayaran = 0;

        try {
            System.out.print("Berapa total harga belanja Anda? ");
            totalBelanja = in.nextInt();
            System.out.print("Berapa total uang yang Anda bayarkan? ");
            pembayaran = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Maaf, pastikan inputan Anda adalah angka");
            in.close();
            return;
        }

        if (totalBelanja == pembayaran) {
            System.out.println("Terima kasih telah membayar dengan uang pas");
        } else if (pembayaran < totalBelanja) {
            System.out.println("Maaf, pembayaran Anda belum mencukupi");   
        } else {
            int kembalian = pembayaran - totalBelanja;
            System.out.println("Total kembalian Anda : " + kembalian);
            System.out.println("Dengan rincian sebagai berikut : ");
            int seratusRibu, limaPuluhRibu, duaPuluhRibu, sepuluhRibu, limaRibu, duaRibu, seribu, limaRatusRupiah, duaRatusRupiah, seratusRupiah;
            seratusRibu = 0;
            limaPuluhRibu = 0;
            duaPuluhRibu = 0;
            sepuluhRibu = 0;
            limaRibu = 0;
            duaRibu = 0;
            seribu = 0;
            limaRatusRupiah = 0;
            duaRatusRupiah = 0;
            seratusRupiah = 0;

            if (kembalian >= 100000) {
                kembalian = kembalian - 100000;
                seratusRibu = seratusRibu + 1;
            }
            if (kembalian >= 50000) {
                kembalian = kembalian - 50000;
                limaPuluhRibu = limaPuluhRibu + 1;
            }
            if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                duaPuluhRibu = duaPuluhRibu + 1;
            }
            if (kembalian >= 10000) {
                kembalian = kembalian - 10000;
                sepuluhRibu = sepuluhRibu + 1;
            }
            if (kembalian >= 5000) {
                kembalian = kembalian - 5000;
                limaRibu = limaRibu + 1;
            }
            if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                duaRibu = duaRibu + 1;
            }
            if (kembalian >= 1000) {
                kembalian = kembalian - 1000;
                seribu = seribu + 1;
            }
            if (kembalian >= 500) {
                kembalian = kembalian - 500;
                limaRatusRupiah = limaRatusRupiah + 1;
            }
            if (kembalian >= 200) {
                kembalian = kembalian - 200;
                duaRatusRupiah = duaRatusRupiah + 1;
            }
            if (kembalian >= 100) {
                kembalian = kembalian - 100;
                seratusRupiah = seratusRupiah + 1;
            }

            if (seratusRibu > 0) {
                System.out.println(seratusRibu + " lembar uang Rp. 100000");
            }
            if (limaPuluhRibu > 0) {
                System.out.println(limaPuluhRibu + " lembar uang Rp. 50000");
            }
            if (duaPuluhRibu > 0) {
                System.out.println(duaPuluhRibu + " lembar uang Rp. 20000");
            }
            if (sepuluhRibu > 0) {
                System.out.println(sepuluhRibu + " lembar uang Rp. 10000");
            }
            if (limaRibu > 0) {
                System.out.println(limaRibu + " lembar uang Rp. 5000");
            }
            if (duaRibu > 0) {
                System.out.println(duaRibu + " lembar uang Rp. 2000");
            }
            if (seribu > 0) {
                System.out.println(seribu + " lembar uang Rp. 1000");
            }
            if (limaRatusRupiah > 0) {
                System.out.println(limaRatusRupiah + " buah uang Rp. 500");
            }
            if (duaRatusRupiah > 0) {
                System.out.println(duaRatusRupiah + " buah uang Rp. 200");
            }
            if (seratusRupiah > 0) {
                System.out.println(seratusRupiah + " buah uang Rp. 100");
            }
            if (kembalian > 0) {
                System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
            }
        }
        
        in.close();    
    }
}
