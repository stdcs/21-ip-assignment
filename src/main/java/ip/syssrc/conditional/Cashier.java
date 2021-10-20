package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211083 - Liska Dewi Rombe <rombeliska@gmail.com>
 *
 */
public class Cashier {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Berapa total harga belanja anda ? ");
        int totalBelanja = In.nextInt();
        
        System.out.println("Berapa total uang anda bayarkan ? ");
        int pembayaran = In.nextInt();
        int kembalian = pembayaran - totalBelanja;
        System.out.println("Total kembalian anda = " + kembalian);
        System.out.println("Dengan dengan rincian sebagai berikut :");
        System.out.println();
        System.out.println();
        int al,b2,c3,d4,e5,f6,g7,h8,i9,jh;
        al = 0;
        b2 = 0;
        c3 = 0;
        d4 = 0;
        e5 = 0;
        f6 = 0;
        g7 = 0;
        h8 = 0;
        i9 = 0;
        jh = 0;

        if (kembalian >= 100000) {
            kembalian = kembalian - 100000;
            al = al + 1;
        }
        if (kembalian >= 50000) {
            kembalian = kembalian - 50000;
            b2 = b2 + 1;
        }
        if (kembalian >= 20000) {
            kembalian = kembalian - 20000;
            c3 = c3 + 1;
        }
        if (kembalian >= 10000) {
            kembalian = kembalian - 10000;
            d4 = d4 + 1;
        }
        if (kembalian >= 5000) {
            kembalian = kembalian - 5000;
            e5 = e5 + 1;
        }   
        if (kembalian >= 2000) {
            kembalian = kembalian - 2000;
            f6 = f6 + 1;
        }
        if (kembalian >= 1000) {
            kembalian = kembalian - 1000;
            g7 = g7 + 1;
        }
        if (kembalian >= 500) {
            kembalian = kembalian - 500;
            h8 = h8 + 1;
        }
        if (kembalian >= 200) {
            kembalian = kembalian - 200;
            i9 = i9 + 1;
        }
        if (kembalian >= 100) {
            kembalian = kembalian - 100;
            jh = jh + 1;
        }
        if (al > 0) {
            System.out.println(al + " lembar uang Rp.100000");
        } 
        if (b2 > 0) {
            System.out.println(b2 + " lembar uang Rp.50000");
        } 
        if (c3 > 0) {
            System.out.println(c3 + " lembar uang Rp.20000");
        } 
        if (d4 > 0) {
            System.out.println(d4 + " lembar uang Rp.10000");
        } 
        if (e5 > 0) {
            System.out.println(e5 + " lembar uang Rp.5000");
        } 
        if (f6 > 0) {
            System.out.println(f6 + " lembar uang Rp.2000");
        } 
        if (g7 > 0) {
            System.out.println(g7 + " lembar uang Rp.1000");
        } 
        if (h8 > 0) {
            System.out.println(h8 + " lembar uang Rp.500");
        } 
        if (i9 > 0) {
            System.out.println(i9 + " lembar uang Rp.200");
        } 
        if (jh > 0) {
            System.out.println(jh + " lembar uang Rp.100");
        }
        if (kembalian > 0) {
            System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
        }

        
        In.close();
    }
}
