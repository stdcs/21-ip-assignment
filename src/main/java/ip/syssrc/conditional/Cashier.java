package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211066 - Syifa Ur Rahmi <sifasisi3@gmail.com>
 *
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Cashier {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalHarga = 0;
        int uangYangdiBayarkan = 0;

        try {
            System.out.println("Berapa total harga belanja Anda?");
            totalHarga = in.nextInt();
            System.out.println("Berapa total uang yang Anda bayarkan?");
            uangYangdiBayarkan = in.nextInt();   
        } catch (InputMismatchException ime) {
            System.out.println("Maaf pastikan inputan Anda adalah angka");
            System.out.println(ime.toString());
        } finally {
            in.close();
        }
 
        int kembalian, jumlah, sisa;

        kembalian = uangYangdiBayarkan - totalHarga;
        sisa = kembalian;

        if (totalHarga == uangYangdiBayarkan){
            System.out.println("Terima kasih telah membayar dengan uang pas.");
        } else if (totalHarga > uangYangdiBayarkan){
            System.out.println("Maaf pembayaran Anda belum mencukupi.");
        } else {
            System.out.println("Total kembalian Anda: Rp " + kembalian);
            System.out.println("Dengan rincian sebagai berikut: \n");
            if (sisa >= 100000) {
                jumlah = sisa / 100000;
                System.out.println(jumlah + " lembar Rp. 100.000 \n ");
                sisa = sisa - (jumlah*100000);
            } if (sisa >= 50000) {
                jumlah = sisa / 50000;
                System.out.println(jumlah + " lembar Rp. 50.000 \n");
                sisa = sisa - (jumlah*50000);
            } if (sisa >= 20000) {
                jumlah = sisa / 20000;
                System.out.println(jumlah + " lembar Rp. 20.000 \n");
                sisa = sisa - (jumlah*20000);
            } if (sisa >= 10000) {
                jumlah = sisa / 10000;
                System.out.println(jumlah + " lembar Rp. 10.000 \n");
                sisa = sisa - (jumlah*10000);
            } if (sisa >= 5000) {
                jumlah = sisa / 5000;
                System.out.println(jumlah + " lembar Rp. 5.000 \n");
                sisa = sisa - (jumlah*5000);
            } if (sisa >= 2000) {
                jumlah = sisa / 2000;
                System.out.println(jumlah + " lembar Rp. 2.000 \n");
                sisa = sisa - (jumlah*2000);
            } if (sisa >= 1000) {
                jumlah = sisa / 1000;
                System.out.println(jumlah + " lembar Rp. 1.000 \n");
                sisa = sisa - (jumlah*1000);
            } if (sisa >= 500) {
                jumlah = sisa / 500;
                System.out.println(jumlah + " buah Rp. 500 \n");
                sisa = sisa - (jumlah*500);
            } if (sisa >= 200) {
                jumlah = sisa / 200;
                System.out.println(jumlah + " buah Rp. 200 \n");
                sisa = sisa - (jumlah*200);
            } if (sisa >= 100) {
                jumlah = sisa / 100;
                System.out.println(jumlah + " buah Rp.100 \n");
                sisa = sisa - (jumlah*100);
            } else if (sisa <= 100){
                System.out.println("Dan sisanya Rp. " + sisa + " didonasikan");
            }
        }
        in.close();
    }
}
