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

        try {
            System.out.println("Berapa total harga belanja anda ? ");
            int totalBelanja = in.nextInt();

            System.out.println("Berapa total uang anda bayarkan ? ");
            int pembayaran = in.nextInt();   
        } catch (InputMismatch Exception e) {
        } catch (Exception e) {
            System.out.println("maaf pastikan inputan anda adalah angka");
            return;
        }
       
        System.out.println("Dengan dengan rincian sebagai berikut :");
        System.out.println();
        System.out.println();
        int kembalian = pembayaran - totalBelanja;
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
            a = a + 1;
            int pecahan = (Kembalian / 100000);
            Kembalian -= (100000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 100.000");

        }
        if (kembalian >= 50000) {
            kembalian = kembalian - 50000;
            b = b + 1;
        }
        if (kembalian >= 20000) {
            kembalian = kembalian - 20000;
            c = c + 1;
            int pecahan = (Kembalian / 50000);
            Kembalian -= (50000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 100.000");

        }
        if (kembalian >= 20000) {
            kembalian = kembalian - 20000;
            c = c + 1;
            int pecahan = (Kembalian / 20000);
            Kembalian -= (20000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 100.000");

        }
        if (kembalian >= 10000) {
            kembalian = kembalian - 10000;
            d = d + 1;
            int pecahan = (Kembalian / 10000);
            Kembalian -= (10000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 100.000");

        }
        if (kembalian >= 5000) {
            kembalian = kembalian - 5000;
            e = e + 1;
            int pecahan = (Kembalian / 5000);
            Kembalian -= (5000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 100.000");

        }   
        if (kembalian >= 2000) {
            kembalian = kembalian - 2000;
            f = f + 1;
        }
        if (kembalian >= 2000) {
            kembalian = kembalian - 2000;
            f = f + 1;
            int pecahan = (Kembalian / 2000);
            Kembalian -= (2000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 100.000");

        }
        if (kembalian >= 1000) {
            kembalian = kembalian - 1000;
            g = g + 1;
            int pecahan = (Kembalian / 1000);
            Kembalian -= (1000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 100.000");

        }
        if (kembalian >= 500) {
            kembalian = kembalian - 500;
            h = h + 1;
        }
        if (kembalian >= 200) {
            kembalian = kembalian - 200;
            i = i + 1;
            int pecahan = (Kembalian / 500);
            Kembalian -= (500 * pecahan);
            System.out.println(pecahan + " buah uang Rp. 100.000");

        }
        if (kembalian >= 200) {
            kembalian = kembalian - 200;
            i = i + 1;
            int pecahan = (Kembalian / 200);
            Kembalian -= (200 * pecahan);
            System.out.println(pecahan + " buah uang Rp. 100.000");

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
            int pecahan = (Kembalian / 100);
            Kembalian -= (100 * pecahan);
            System.out.println(pecahan + " buah uang Rp. 100.000");

        }
        if (kembalian > 0) {
            System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
        }

    }else if (uang < totalBelanja){
        System.out.println("Maaf, pembayaran anda belum mencukupi");
    }else {
        System.out.println("Terimakasih telah membayar dengan uang pas");

        in.close();
    }
