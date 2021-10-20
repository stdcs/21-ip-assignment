package ip.syssrc.conditional;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
 *
 */
import java.util.Scanner;
public class Cashier {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
<<<<<<< HEAD
        // output dan variabel //
        int total = 0;
        int bayar = 0;
        // try catch
         try {
            System.out.printf("Berapa total harga belanja anda ? " );
            total = in.nextInt();
            System.out.printf("Berapa total uang yang anda bayarkan ? ");
            bayar = in.nextInt(); 
             
        } catch (InputMismatchException e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            in.close();
            return;
        }
        int kembalian = bayar - total; 
         // jika uang mencukupi //
        if (bayar > total){
            System.out.printf("\nTotal kembalian anda : Rp %d", kembalian);
            System.out.printf("\nDengan rincian sebagai berikut : \n\n");
        }
        if (kembalian >= 100000){
            int seratus = kembalian / 100000;
            System.out.printf("%d Lembar uang Rp. 100.000\n", seratus);
            kembalian = kembalian % 100000;
        }
<<<<<<< HEAD
<<<<<<< HEAD
=======
        
>>>>>>> 45a162b (feat(conditional/Cashier.java):fix if else statement)
=======
>>>>>>> aaa69ec (feat(conditional/Cashier.java):fix if else format)
        if (kembalian >= 50000 ){
            int limaPuluh = kembalian / 50000;
            System.out.printf("%d Lembar uang Rp. 50.000\n", limaPuluh);
            kembalian = kembalian % 50000;
        }
        if (kembalian >= 20000 ){
            int duaPuluh = kembalian / 20000;
            System.out.printf("%d Lembar uang Rp. 20.000\n", duaPuluh);
            kembalian = kembalian % 20000;
        }
        if (kembalian >= 10000 ){
            int sepuluh = kembalian / 10000;
            System.out.printf("%d Lembar uang Rp. 10.000\n", sepuluh);
            kembalian = kembalian % 10000;
        }
        if (kembalian >= 5000 ){
            int limaRibu = kembalian / 5000;
            System.out.printf("%d Lembar uang Rp. 5.000\n", limaRibu);
            kembalian = kembalian % 5000;
        }
        if (kembalian >= 2000 ){
            int duaRibu = kembalian / 2000;
            System.out.printf("%d Lembar uang Rp. 2.000\n", duaRibu);
            kembalian = kembalian % 2000;
        }
        if (kembalian >= 1000 ){
            int seribu = kembalian / 1000;
            System.out.printf("%d Lembar uang Rp. 1.000\n", seribu);
            kembalian = kembalian % 1000;
        }
        if (kembalian >= 500 ){
            int limaBuah = kembalian / 500;
            System.out.printf("%d buah uang Rp. 500\n", limaBuah);
            kembalian = kembalian % 500;
        }
        if (kembalian >= 200 ){
            int duaBuah = kembalian / 200 ;
            System.out.printf("%d buah uang Rp. 200\n", duaBuah);
            kembalian = kembalian % 200;
        }
        if (kembalian >= 100 ){
            int satuBuah = kembalian / 100;
            System.out.printf("%d buah uang Rp. 100\n", satuBuah);
            kembalian = kembalian % 100;
        }
        if (kembalian <100 && kembalian > 0){
            int donasi = kembalian;
            System.out.printf("Dan sebanyak Rp. %d didonasikan\n", donasi);
        }
        // jika uang pas // 
        if (bayar == total){
            System.out.println("Terima kasih telah membayar dengan uang pas");
    }
        // jika uang tidak cukup //
        if (bayar < total){
            System.out.println("Maaf, pembayaran anda belum mencukupi");
        }
        in.close();
=======
        System.out.printf("Berapa total harga belanja anda ? " );
        int total = in.nextInt();
        System.out.printf("Berapa total uang yang anda bayarkan ? ");
        int bayar = in.nextInt();
        int kembalian = bayar - total;
        
            // jika uang mencukupi //
        if (bayar > total){
        System.out.printf("\nTotal kembalian anda : Rp %d\n", kembalian);
        System.out.printf("Dengan rincian sebagai berikut : \n");
        if (kembalian >= 100000){
            int seratus = kembalian / 100000;
            System.out.printf("\n%d Lembar uang Rp. 100.000\n", seratus);
        }
        kembalian = kembalian % 100000;
        if (kembalian >= 50000 & kembalian <= 100000){
            int limaPuluh = kembalian / 50000;
            System.out.printf("%d Lembar uang Rp. 50.000\n", limaPuluh);
        }
        kembalian = kembalian % 50000;
        if (kembalian >= 20000 & kembalian <= 50000){
            int duaPuluh = kembalian / 20000;
            System.out.printf("%d Lembar uang Rp. 20.000\n", duaPuluh);
        }
        kembalian = kembalian % 20000;
        if (kembalian >= 10000 & kembalian <= 20000){
            int sepuluh = kembalian / 10000;
            System.out.printf("%d Lembar uang Rp. 10.000\n", sepuluh);
        }
        kembalian = kembalian % 10000;
        if (kembalian >= 5000 & kembalian <= 10000){
            int limaRibu = kembalian / 5000;
            System.out.printf("%d Lembar uang Rp. 5.000\n", limaRibu);
        }    
        kembalian = kembalian % 5000;
        if (kembalian >= 2000& kembalian <= 5000){
            int duaRibu = kembalian / 2000;
            System.out.printf("%d Lembar uang Rp. 2.000\n", duaRibu);
        }
        kembalian = kembalian % 2000;
        if (kembalian >= 1000& kembalian <= 2000){
            int seribu = kembalian / 1000;
            System.out.printf("%d Lembar uang Rp. 1.000\n", seribu);
        }
        kembalian = kembalian % 1000;
        if (kembalian >= 500 & kembalian <= 1000){
            int limaBuah = kembalian / 500;
            System.out.printf("%d buah uang Rp. 500\n", limaBuah);
        }
        kembalian = kembalian % 500;
        if (kembalian >= 200 & kembalian <= 500){
            int duaBuah = kembalian / 200 ;
            System.out.printf("%d buah uang Rp. 200\n", duaBuah);
        }
        kembalian = kembalian % 200;
        if (kembalian >= 100 & kembalian <= 200){
            int satuBuah = kembalian / 100;
            System.out.printf("%d buah uang Rp. 100\n", satuBuah);
        }
        kembalian = kembalian % 100;
        if (kembalian > 0 & kembalian <= 100){
            int donasi = kembalian;
            System.out.printf("Dan sebanyak Rp. %d didonasikan\n", donasi);
        }
    }
        // jika uang pas //
        if (bayar == total){
            System.out.println("Terima kasih telah membayar dengan uang pas");
    }
        // jika uang tidak cukup // 
        if (bayar < total){
            System.out.println("Maaf, pembayaran anda belum mencukupi");
        }
    in.close();
>>>>>>> f8ee011 (feat(conditional/Cashier): add 'java.util.Scanner' object)
    }
}
         