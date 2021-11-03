package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071171512 - Adelia puspita <adhepuspita123@gmail.com>
 *
 */
import java.util.Scanner;
public class Cashier {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int totalBelanja = 0;
        int pembayaran = 0;
        int kembalian = 0;

        try{
            System.out.println("Berapa total harga belanja anda ? ");
            totalBelanja = In.nextInt();
            System.out.println("Berapa total uang anda bayarkan ? ");
            pembayaran = In.nextInt();
        } 
        catch(Exception e){
            System.out.println("maaf,pastikan inputan anda adalah angka");
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
                a = kembalian / 100000;
                kembalian %= 100000;
            }
            if (kembalian >= 50000) {
                b = kembalian / 50000;
                kembalian %= 50000;
            }
            if (kembalian >= 20000) {
                c = kembalian / 20000;
                kembalian %= 20000;
            }
            if (kembalian >= 10000) {
                d = kembalian / 10000;
                kembalian %= 10000;
            }
            if (kembalian >= 5000) {
                e = kembalian / 5000;
                kembalian %= 5000;
            }   
            if (kembalian >= 2000) {
                f = kembalian / 2000;
                kembalian %= 2000;
            }
            if (kembalian >= 1000) {
                g = kembalian / 1000;
                kembalian %= 1000;
            }
            if (kembalian >= 500) {
                h = kembalian / 500;
                kembalian %= 500;
            }
            if (kembalian >= 200) {
                i = kembalian / 200;
                kembalian %= 200;
            }
            if (kembalian >= 100) {
                j = kembalian / 100;
                kembalian %= 100;
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
        In.close();