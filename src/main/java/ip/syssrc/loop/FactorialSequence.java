package ip.syssrc.loop;

/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
import java.util.Scanner;
public class FactorialSequence {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int angka,jumlah,i;
        jumlah = 1;

        System.out.print("Masukkan Angka = ");
        angka = sc.nextInt();
        i = angka;

        if(i !=0) {
            System.out.printf("%d", angka);
            while ( i >= 1) {
                jumlah *=i;
                if(i == angka){
                    System.out.printf(" = %d", i);
                } else {
                    System.out.printf(" x %d", i);
                }
                i--;
            }
        } else {
            jumlah = 1;
            sc.close();
        }
        System.out.printf(" = %d", jumlah);
    }
}
