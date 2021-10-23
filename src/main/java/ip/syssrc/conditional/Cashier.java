package ip.syssrc.conditional;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211068 - Michael Gabriel Bida <michaelgabriel663@gmail.com>
 *
 */
public class Cashier {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int harga;
        int pembayaran;
        
        try {
            System.out.print("Berapa total harga belanja anda ? ");
            harga = scan.nextInt();
            System.out.print("Berapa total uang anda bayarkan ? ");
            pembayaran = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Maaf, pastikan inputan belanja anda adalah angka");
            scan.close();
            return;
        }
           
        int kembalian = pembayaran - harga;      
        
        if (kembalian < 0){
            System.out.println("Maaf, pembayaran anda belum mencukupi");    
        }
        else if(kembalian == 0){ 
            System.out.println("Terima kasih telah membayar dengan uang pas");        
        }    
        else if(kembalian >= 0){ 
            System.out.println("Total kembalian anda : Rp." + kembalian);
            System.out.printf("Dengan dengan rincian sebagai berikut : %n");
        
          if (kembalian >= 100000) {
              System.out.println(kembalian / 100000 + " lembar uang Rp. 100.000");
              kembalian %= 100000;
          }
          if (kembalian >= 50000) {
              System.out.println(kembalian / 50000 + " lembar uang Rp. 50.000");
              kembalian %= 50000;
          }
          if (kembalian >= 20000) {
              System.out.println(kembalian / 20000 + " lembar uang Rp. 20.000");
              kembalian %= 20000;
          }          
          if (kembalian >= 10000) {
              System.out.println(kembalian / 10000 + " lembar uang Rp. 10.000");
              kembalian %= 10000;
          }
          if (kembalian >= 5000) {
              System.out.println(kembalian / 5000 + " lembar uang Rp. 5.000");
              kembalian %= 5000;
          }   
          if (kembalian >= 2000) {
              System.out.println(kembalian / 2000 + " lembar uang Rp. 2.000");
              kembalian %= 2000;
          }
          if (kembalian >= 1000) {
              System.out.println(kembalian / 1000 + " lembar uang Rp. 1.000");
              kembalian %= 1000;              
          }
          if (kembalian >= 500) {
              System.out.println(kembalian / 500 + " buah uang Rp. 500");
              kembalian %= 500;
          }
          if (kembalian >= 200) {
              System.out.println(kembalian / 200 + " buah uang Rp. 200");
              kembalian %= 200;
          }         
          if (kembalian >= 100) {
              System.out.println(kembalian / 100 + " buah uang Rp. 100");
              kembalian %= 100;
          }          
          if (kembalian > 0) {
              System.out.println("Dan sebanyak Rp." + kembalian + " didonasikan");
          }
        }       
        
        scan.close();
    }
}
       
        
             