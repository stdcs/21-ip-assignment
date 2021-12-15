package ip.syssrc.conditional;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
public class CashierSolution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int price = 0;
        int payment = 0;

        try {
            System.out.print("Berapa total harga belanja anda ? ");
            price = scan.nextInt();
            System.out.print("Berapa total uang yang anda bayarkan ? ");
            payment = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            scan.close();
            return;
        } finally {
            scan.close();
        }

        if (payment < price) {
            System.out.println("Maaf, pembayaran anda belum mencukupi\n");
            return;
        }

        if (payment == price) {
            System.out.println("Terima kasih telah membayar dengan uang pas\n");
            return;
        }

        int change = payment - price;

        System.out.printf("\nTotal kembalian anda: Rp %d\n", change);
        System.out.println("Dengan rincian sebagai berikut:\n");

        if (change >= 100_000) {
            System.out.printf("%d lembar uang Rp. 100.000\n", change / 100_000);
            change %= 100_000;
        }
        if (change >= 50_000) {
            System.out.printf("%d lembar uang Rp. 50.000\n", change / 50_000);
            change %= 50_000;
        }
        if (change >= 20_000) {
            System.out.printf("%d lembar uang Rp. 20.000\n", change / 20_000);
            change %= 20_000;
        }
        if (change >= 10_000) {
            System.out.printf("%d lembar uang Rp. 10.000\n", change / 10_000);
            change %= 10_000;
        }
        if (change >= 5_000) {
            System.out.printf("%d lembar uang Rp. 5.000\n", change / 5_000);
            change %= 5_000;
        }
        if (change >= 2_000) {
            System.out.printf("%d lembar uang Rp. 2.000\n", change / 2_000);
            change %= 2_000;
        }
        if (change >= 1_000) {
            System.out.printf("%d lembar uang Rp. 1.000\n", change / 1_000);
            change %= 1_000;
        }
        if (change >= 500) {
            System.out.printf("%d buah uang Rp. 500\n", change / 500);
            change %= 500;
        }
        if (change >= 200) {
            System.out.printf("%d buah uang Rp. 200\n", change / 200);
            change %= 200;
        }
        if (change >= 100) {
            System.out.printf("%d buah uang Rp. 100\n", change / 100);
            change %= 100;
        }

        if (change > 0) {
            System.out.printf("Dan sebanyak Rp. %d didonasikan\n", change);
        }

        System.out.println();
    }
}
