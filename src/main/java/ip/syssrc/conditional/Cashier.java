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

            int a,b,c,d,e,f,g,h,i,j;
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            g = 0;
            h = 0;
            i = 0;
            j = 0;

            if (kembalian >= 100000) {
                kembalian = kembalian - 100000;
                a = a + 1;
            } if (kembalian >= 50000) {
                kembalian= kembalian - 50000;
                b = b + 1;
            } if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                c = c + 1;
            } if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                c = c + 1;
            } if (kembalian >= 10000) {
                kembalian = kembalian - 10000;
                d = d + 1;
            } if (kembalian >= 5000) {
                kembalian= kembalian - 5000;
                e = e + 1;
            } if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                f = f + 1;
            } if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                f = f + 1;
            } if (kembalian >= 1000) {
                kembalian = kembalian - 1000;
                g = g + 1;
            } if (kembalian >= 500) {
                kembalian = kembalian - 500;
                h = h + 1;
            } if (kembalian >= 200) {
                kembalian = kembalian - 200;
                i = i + 1;
            } if (kembalian >= 200) {
                kembalian = kembalian - 200;
                i = i + 1;
            } if (kembalian >= 100) {
                kembalian = kembalian - 100;
                j = j + 1;
            }if (a > 0) {
                System.out.println(a+ " lembar uang Rp. 100.000");
            }if (b > 0) {
                System.out.println(b+ " lembar uang Rp. 50.000");
            }if (c > 0) {
                System.out.println(c+ " lembar uang Rp. 20.000");
            }if (d > 0) {
                System.out.println(d+ " lembar uang Rp. 10.000");
            }if (e > 0) {
                System.out.println(e+ " lembar uang Rp. 5.000");
            }if (f > 0) {
                System.out.println(f+ " lembar uang Rp. 2.000");
            }if (g > 0) {
                System.out.println(g+ " lembar uang Rp. 1.000");
            }if (h > 0) {
                System.out.println(h+ " buah uang Rp. 500");
            }if (i > 0) {
                System.out.println(i+ " buah uang Rp. 200");
            }if (j > 0) {
                System.out.println(j+ " buah uang Rp. 100");
            }if (kembalian > 0) {
                System.out.println("Dan sebanyak Rp. " +kembalian+ " didonasikan");
            }
        }
    }
}
