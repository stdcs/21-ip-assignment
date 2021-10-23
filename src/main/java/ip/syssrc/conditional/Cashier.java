package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211064 - Agung Kartika Ardhiyanda < agungardhiyanda25@gmail.com >
 *
 */
import java.util.Scanner;
public class Cashier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int jumlahbelanja;
    int jumlahuangyangdimiliki;
    int sisa;
    int a,b,c,d,e,f,g,h,i,j;
    System.out.print("Masukkan Total Belanja Anda = ");
    jumlahbelanja = sc.nextInt();
    System.out.print("Masukkan Uang Anda = ");
    jumlahuangyangdimiliki= sc.nextInt();
    int kembalian = jumlahuangyangdimiliki-jumlahbelanja;
    System.out.println("Total Kembalian Rp"+kembalian);

    if (jumlahuangyangdimiliki>jumlahbelanja){
     a = (kembalian/100000);
    sisa = (kembalian % 100000);
       b = (sisa/50000);
     sisa = (sisa % 50000);
     c = (sisa/20000);
     sisa = (sisa % 20000);
     d = (sisa / 10000);
     sisa = (sisa % 10000);
     e = (sisa / 5000);
     sisa = (sisa % 5000);
     f = (sisa/2000);
     sisa = (sisa % 2000);
     g = (sisa / 1000);
     sisa = (sisa % 1000);
     h = (sisa / 500);
     sisa = (sisa % 500);
     i = (sisa / 200);
     sisa = (sisa % 200);
     j = (sisa / 100);
     sisa = (sisa % 100);
   
if(a>0) System.out.println(a+" Lembar Rp100.000");
if(b>0) System.out.println(b+" Lembar Rp50.000");
if (c>0)System.out.println(c+" Lembar Rp20.000");
if (d>0) System.out.println(d+" Lembar Rp10.000");
if (e>0) System.out.println(e+" Lembar Rp5.000");
if(f>0) System.out.println(f+" Lembar Rp2.000");
if(g>0) System.out.println(g+" Lembar Rp1.000");
if(h>0) System.out.println(h+" Lembar Rp500");
if(i>0) System.out.println(i+" Lembar Rp200");
if(j>0) System.out.println(j+" Lembar Rp100");
if(sisa<100) System.out.println("Rp"+sisa+" Akan Didonasikan");
 }else if (jumlahuangyangdimiliki<jumlahbelanja){
     System.out.println("Mohon Maaf Uang Anda Tidak Cukup");
 } else if (jumlahuangyangdimiliki==jumlahbelanja){
     System.out.println("Uang Anda Pas, Terima Kasih");
    }
    sc.close();
}
}
