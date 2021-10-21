// NAMA : MUHAMMAD SOFYAN DAUD PUJAS
// NIM : H071211045

package ip.syssrc.conditional;

import java.util.Scanner;
public class Cashier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menentukan Variabel
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;

        // Interface
        System.out.print("\nBerapa total harga belanja anda ? Rp.");
        int totalBelanja = sc.nextInt();
        
        System.out.print("Berapa total uang anda bayarkan ? Rp.");
        int pembayaran = sc.nextInt();

        // Kalkulasikan
        int kembalian = pembayaran - totalBelanja;
        if (pembayaran < totalBelanja) { System.out.println("\nPembayaran tidak cukup\nMaaf, anda memiliki hutang sebesar" + " Rp." + (totalBelanja-pembayaran)+"\n"); } else {
        System.out.println("\nTotal kembalian anda = " + kembalian);
        System.out.println("Dengan dengan rincian sebagai berikut : \n");

        if (kembalian >= 100000) {
            kembalian = kembalian - 100000;
            a = a + 1;
        }
        if (kembalian >= 50000) {
            kembalian = kembalian - 50000;
            b = b + 1;
        }
        if (kembalian >= 20000) {
            kembalian = kembalian - 20000;
            c = c + 1;
        }
        if (kembalian >= 20000) {
            kembalian = kembalian - 20000;
            c = c + 1;
        }
        if (kembalian >= 10000) {
            kembalian = kembalian - 10000;
            d = d + 1;
        }
        if (kembalian >= 5000) {
            kembalian = kembalian - 5000;
            e = e + 1;
        }   
        if (kembalian >= 2000) {
            kembalian = kembalian - 2000;
            f = f + 1;
        }
        if (kembalian >= 2000) {
            kembalian = kembalian - 2000;
            f = f + 1;
        }
        if (kembalian >= 1000) {
            kembalian = kembalian - 1000;
            g = g + 1;
        }
        if (kembalian >= 500) {
            kembalian = kembalian - 500;
            h = h + 1;
        }
        if (kembalian >= 200) {
            kembalian = kembalian - 200;
            i = i + 1;
        }
        if (kembalian >= 200) {
            kembalian = kembalian - 200;
            i = i + 1;
        }
        if (kembalian >= 100) {
            kembalian = kembalian - 100;
            j = j + 1;
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
            System.out.println(h + " lembar uang Rp.500");
        } 
        if (i > 0) {
            System.out.println(i + " lembar uang Rp.200");
        } 
        if (j > 0) {
            System.out.println(j + " lembar uang Rp.100");
        }
        if (kembalian > 0) {
            System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
        }
        System.out.println();
        System.out.println("\nLicensed to Sysmart, by sofyanox12\n");

    }
        sc.close();
    }
}

/* Licensed to SysMart, by sofyanox12 */