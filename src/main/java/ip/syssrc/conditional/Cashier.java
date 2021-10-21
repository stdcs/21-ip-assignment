package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211074 - Wd. Ananda Lesmono <nandalesmono@gmail.com>
 *
 */
import java.util.Scanner;
public class Cashier {

    public static void main(String[] args) {
        Scanner nanda = new Scanner(System.in);

        int uang, totalBelanja;
        try {
            System.out.print("Berapakah total harga belanja anda ? ");
            totalBelanja = nanda.nextInt();
            System.out.print("Berapakah total uang anda bayaran ? ");
            uang = nanda.nextInt();
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            return;
        }
      
        
        
        
        int kembalian = uang - totalBelanja;
        if (kembalian == 0) {
            System.out.println("Terimakasih telah membayar dengan uang pas");
        }else if (kembalian < 0){
            System.out.println("Maaf, pembayaran anda belum mencukupi");
        }else {
            System.out.println("Total kembalian anda: Rp. " +kembalian);
            System.out.println("Dengan rincian sebagai berikut:");
            System.out.println();
            System.out.println();

            int seratusRibu,limaPuluhRibu,duaPuluhRibu,sepuluhRibu,limaRibu,duaRibu,seribu,limaRatus,duaRatus,seratus;
            seratusRibu = 0;
            limaPuluhRibu = 0;
            duaPuluhRibu = 0;
            sepuluhRibu = 0;
            limaRibu = 0;
            duaRibu = 0;
            seribu = 0;
            limaRatus = 0;
            duaRatus = 0;
            seratus = 0;

            if (kembalian >= 100000) {
                kembalian = kembalian - 100000;
                seratusRibu = seratusRibu + 1;
            } if (kembalian >= 50000) {
                kembalian= kembalian - 50000;
                limaPuluhRibu = limaPuluhRibu + 1;
            } if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                duaPuluhRibu = duaPuluhRibu + 1;
            } if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                duaPuluhRibu = duaPuluhRibu + 1;
            } if (kembalian >= 10000) {
                kembalian = kembalian - 10000;
                sepuluhRibu = sepuluhRibu + 1;
            } if (kembalian >= 5000) {
                kembalian= kembalian - 5000;
                limaRibu = limaRibu + 1;
            } if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                duaRibu = duaRibu + 1;
            } if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                duaRibu = duaRibu + 1;
            } if (kembalian >= 1000) {
                kembalian = kembalian - 1000;
                seribu = seribu + 1;
            } if (kembalian >= 500) {
                kembalian = kembalian - 500;
                limaRatus = limaRatus + 1;
            } if (kembalian >= 200) {
                kembalian = kembalian - 200;
                duaRatus = duaRatus + 1;
            } if (kembalian >= 200) {
                kembalian = kembalian - 200;
                duaRatus = duaRatus + 1;
            } if (kembalian >= 100) {
                kembalian = kembalian - 100;
                seratus = seratus + 1;
            }if (seratusRibu > 0) {
                System.out.println(seratusRibu+ " lembar uang Rp. 100.000");
            }if (limaPuluhRibu > 0) {
                System.out.println(limaPuluhRibu+ " lembar uang Rp. 50.000");
            }if (duaPuluhRibu > 0) {
                System.out.println(duaPuluhRibu+ " lembar uang Rp. 20.000");
            }if (sepuluhRibu > 0) {
                System.out.println(sepuluhRibu+ " lembar uang Rp. 10.000");
            }if (limaRibu > 0) {
                System.out.println(limaRibu+ " lembar uang Rp. 5.000");
            }if (duaRibu > 0) {
                System.out.println(duaRibu+ " lembar uang Rp. 2.000");
            }if (seribu > 0) {
                System.out.println(seribu+ " lembar uang Rp. 1.000");
            }if (limaRatus > 0) {
                System.out.println(limaRatus+ " buah uang Rp. 500");
            }if (duaRatus > 0) {
                System.out.println(duaRatus+ " buah uang Rp. 200");
            }if (seratus > 0) {
                System.out.println(seratus+ " buah uang Rp. 100");
            }if (kembalian > 0) {
                System.out.println("Dan sebanyak Rp. " +kembalian+ " didonasikan");
            }
        }
    }
}
