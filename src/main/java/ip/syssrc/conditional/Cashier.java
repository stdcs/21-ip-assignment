package ip.syssrc.conditional;

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
        // output dan variabel //
        System.out.printf("Berapa total harga belanja anda ? " );
        int total = in.nextInt();
        System.out.printf("Berapa total uang yang anda bayarkan ? ");
        int bayar = in.nextInt(); 
        int kembalian = bayar - total;


