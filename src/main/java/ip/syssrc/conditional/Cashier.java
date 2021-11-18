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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6ee24d0 (fix(conditional/Cashier): change String to int)
=======
>>>>>>> 6acfac4418971f1a7bd72a63978b49ae464deb5a

        int uang, totalBelanja;
        try {
            System.out.print("Berapakah total harga belanja anda ? ");
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6acfac4418971f1a7bd72a63978b49ae464deb5a
            totalBelanja = nanda.nextInt();
            System.out.print("Berapakah total uang anda bayaran ? ");
            uang = nanda.nextInt();
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            return;
        }
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6acfac4418971f1a7bd72a63978b49ae464deb5a
        int kembalian = uang - totalBelanja;
        if (uang > totalBelanja) {
            System.out.println("Total kembalian anda: Rp. " +kembalian);
            System.out.println("Dengan rincian sebagai berikut:");
            System.out.println();
            System.out.println();        
            int pecahan;
            if (kembalian >= 100000) {
                pecahan = (kembalian / 100000);
                kembalian -= (100000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 100.000");
            } 
            if (kembalian >= 50000) {
                pecahan = (kembalian / 50000);
                kembalian -= (50000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 50.000");
            } 
            if (kembalian >= 20000) {
                pecahan = (kembalian / 20000);
                kembalian -= (20000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 20.000");
            } 
            if (kembalian >= 10000) {
                pecahan = (kembalian / 10000);
                kembalian -= (10000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 10.000");
            } 
            if (kembalian >= 5000) {
                pecahan = (kembalian / 5000);
                kembalian -= (5000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 5.000");
            } 
            if (kembalian >= 2000) {
                pecahan = (kembalian / 2000);
                kembalian -= (2000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 2.000");
            } 
            if (kembalian >= 1000) {
                pecahan = (kembalian / 1000);
                kembalian -= (1000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 1.000");
            } 
            if (kembalian >= 500) {
                pecahan = (kembalian / 500);
                kembalian -= (500 * pecahan);
                System.out.println(pecahan+ " buah uang Rp. 500");
            } 
            if (kembalian >= 200) {
                pecahan = (kembalian / 200);
                kembalian -= 200 * pecahan;
                System.out.println(pecahan+ " buah uang Rp. 200");
            } 
            if (kembalian >= 100) {
                pecahan = (kembalian / 100);
                kembalian -= 100 * pecahan;
                System.out.println(pecahan+ " buah uang Rp. 100");
            }
            if (kembalian > 0) {
                System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
            }
        } else if (uang < totalBelanja) {
            System.out.println("Maaf, pembayaran anda belum mencukupi");
        } else {
            System.out.println("Terimakasih telah membayar dengan uang pas");
<<<<<<< HEAD
=======
        
        System.out.print("Berapakah total harga belanja anda ? ");
        String totalBelanja = nanda.next();
        System.out.print("Berapakah total uang anda bayaran ? ");
        String uang = nanda.next();
        if (totalBelanja.equals(uang)) {
        }else {
=======
            totalBelanja = nanda.next();
=======
            totalBelanja = nanda.nextInt();
>>>>>>> b9b44d1 (fix(conditional/Cashier): change method 'next()' to 'nextInt()')
            System.out.print("Berapakah total uang anda bayaran ? ");
            uang = nanda.nextInt();
        } catch (Exception e) {
>>>>>>> 6ee24d0 (fix(conditional/Cashier): change String to int)
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            return;
        }
      
        
        
        
=======
>>>>>>> dc99099 (fix(conditional/Cahsier): delete space)
        int kembalian = uang - totalBelanja;
        if (uang > totalBelanja) {
            System.out.println("Total kembalian anda: Rp. " +kembalian);
            System.out.println("Dengan rincian sebagai berikut:");
            System.out.println();
            System.out.println();        
            int pecahan;
            if (kembalian >= 100000) {
                pecahan = (kembalian / 100000);
                kembalian -= (100000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 100.000");
            } 
            if (kembalian >= 50000) {
                pecahan = (kembalian / 50000);
                kembalian -= (50000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 50.000");
            } 
            if (kembalian >= 20000) {
                pecahan = (kembalian / 20000);
                kembalian -= (20000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 20.000");
            } 
            if (kembalian >= 10000) {
                pecahan = (kembalian / 10000);
                kembalian -= (10000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 10.000");
            } 
            if (kembalian >= 5000) {
                pecahan = (kembalian / 5000);
                kembalian -= (5000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 5.000");
            } 
            if (kembalian >= 2000) {
                pecahan = (kembalian / 2000);
                kembalian -= (2000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 2.000");
            } 
            if (kembalian >= 1000) {
                pecahan = (kembalian / 1000);
                kembalian -= (1000 * pecahan);
                System.out.println(pecahan+ " lembar uang Rp. 1.000");
            } 
            if (kembalian >= 500) {
                pecahan = (kembalian / 500);
                kembalian -= (500 * pecahan);
                System.out.println(pecahan+ " buah uang Rp. 500");
            } 
            if (kembalian >= 200) {
                pecahan = (kembalian / 200);
                kembalian -= 200 * pecahan;
                System.out.println(pecahan+ " buah uang Rp. 200");
            } 
            if (kembalian >= 100) {
                pecahan = (kembalian / 100);
                kembalian -= 100 * pecahan;
                System.out.println(pecahan+ " buah uang Rp. 100");
            }
<<<<<<< HEAD
>>>>>>> bf8cc79 (feat(conditional/Cashier) : add 'switch' object)
=======
            if (kembalian > 0) {
                System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
            }
        } else if (uang < totalBelanja) {
            System.out.println("Maaf, pembayaran anda belum mencukupi");
        } else {
            System.out.println("Terimakasih telah membayar dengan uang pas");
>>>>>>> 038194f (fix(conditional/Cashier): change code and 'if' block)
=======
>>>>>>> 6acfac4418971f1a7bd72a63978b49ae464deb5a
        }
    }
}
