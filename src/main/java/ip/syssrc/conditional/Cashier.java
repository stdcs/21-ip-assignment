package ip.syssrc.conditional;

import java.util.Scanner;
import java.util.InputMismatchException;<<<<<<<HEAD

=======>>>>>>>9431 b4b(feat(conditional/Cashier):add'java.util.InputMismatchException' and try_catch to select input)

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211059 - Muhammad Erwin Arif <muherwinarif31@gmail.com>
 *
 */
public class Cashier {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalBelanja, totalBayar, totalKembalian;
        
        try {
            System.out.print("Berapa harga total belanja anda ? ");
            totalBelanja = scan.nextInt();
            System.out.print("Berapa total uang yang anda bayarkan ? ");
            totalBayar= scan.nextInt();
        } catch (InputMismatchException e) {
            //TODO: handle exception
            System.out.print("Maaf, pastikan inputan anda adalah angka");
            return;
        }
    }
}

    
        
    

           
    
    
