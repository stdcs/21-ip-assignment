package ip.syssrc.conditional;
import java.util.Scanner;
/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211060 - Andi Muh. Ibnu Hibban Bagoes Malolo <andibagoes1412@gmail.com>
 *
 */
public class Cashier {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int totalbelanja;
        int totaluang;
        int totalkembalian;
        
        try{
            System.out.print("Berapa total uang belanja anda ? ");
            totalbelanja = in.nextInt();
            System.out.println();
            System.out.print("Berapa total uang yang anda bayarkan ? ");
            totaluang = in.nextInt();
        } catch (Exception e){
            System.out.println("Maaf, Pastikan inputan anda berupa angka");
            return;
        } 

        totalkembalian = totaluang - totalbelanja;
        
        if (totalkembalian > 0){
            System.out.println("Total Kembalian anda = Rp " + totalkembalian);
        }else if (totalkembalian == totaluang){
            System.out.println("Terima kasih telah membayar denga uang pas");
        }else if (totalkembalian < 0 ){
            System.out.println("Maaf, Pembayaran anda tidak mencukupi");
        }else {
            System.out.println("Maaf, Pastikan inputan anda berupa angka");
        }
        System.out.println();
        System.out.println("Dengan rincian sebagai berikut :");
        int a, b, c, d, e, f, g, h, i, j;
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

        if (totalkembalian >= 100000){
            totalkembalian = totalkembalian - 100000;
            a = a + 1;
        }
        if (totalkembalian >= 50000){
            totalkembalian = totalkembalian - 50000;
            b = b + 1;
        }
        if (totalkembalian >= 20000){
            totalkembalian = totalkembalian - 20000;
            c = c + 1;
        }
        if (totalkembalian >= 20000){
            totalkembalian = totalkembalian - 20000;
            c = c + 1;
        }
        if (totalkembalian >= 10000){
            totalkembalian = totalkembalian - 10000;
            d = d + 1;
        }
        if (totalkembalian >= 5000){
            totalkembalian = totalkembalian - 5000;
            e = e + 1;
        }
        if (totalkembalian >= 2000){
            totalkembalian = totalkembalian - 2000;
            f = f + 1;
        }
        if (totalkembalian >= 2000){
            totalkembalian = totalkembalian - 2000;
            f = f + 1;
        }
        if (totalkembalian >= 1000){
            totalkembalian = totalkembalian - 1000;
            g = g + 1;
        }
        if (totalkembalian >= 500){
            totalkembalian = totalkembalian - 500;
            h = h + 1;
        }
        if (totalkembalian >= 200){
            totalkembalian = totalkembalian - 200;
            i = i + 1;
        }
        if (totalkembalian >= 200){
            totalkembalian = totalkembalian - 200;
            i = i + 1;
        }
        if (totalkembalian >= 100){
            totalkembalian = totalkembalian - 100;
            j = j + 1;
        }
        if (a > 0) {
            System.out.println(a + " Lembar uang Rp 100.000");
        } 
        if (b > 0) {
            System.out.println(b + " Lembar uang Rp 50.000");
        } 
        if (c > 0) {
            System.out.println(c + " Lembar uang Rp 20.000");
        } 
        if (d > 0) {
            System.out.println(d + " Lembar uang Rp 10.000");
        } 
        if (e > 0) {
            System.out.println(e + " Lembar uang Rp 5.000");
        } 
        if (f > 0) {
            System.out.println(f + " Lembar uang Rp 2.000");
        } 
        if (g > 0) {
            System.out.println(g + " Lembar uang Rp 1.000");
        } 
        if (h > 0) {
            System.out.println(h + " Lembar uang Rp 500");
        } 
        if (i > 0) {
            System.out.println(i + " Lembar uang Rp 200");
        } 
        if (j > 0) {
            System.out.println(j + " Lembar uang Rp 100");
        }
        if (totalkembalian > 0){
            System.out.println("Dan Sebanyak " + totalkembalian + " didonasikan");
        }
        in.close();
    }
}
