package ip.syssrc.conditional;
import java.util.Scanner;
/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211078 - Muh Fajar Siddiq (fsiddiq072@gmail.com)
 *
 */
public class Cashier {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Berapa total harga belanja anda ? ");
        int totalBelanja = 0;
        int kembalian = 0;
        int pembayaran = 0;
        try {
            totalBelanja = In.nextInt();
            System.out.println("Berapa total uang anda bayarkan ? ");
<<<<<<< HEAD
<<<<<<< HEAD
            pembayaran = In.nextInt();  
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            //TODO: handle exception
        } 
        if (totalBelanja > pembayaran) {
            System.out.println("Uang Anda Kurang");
=======
                pembayaran = In.nextInt();  
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            //TODO: handle exception
        }

            if (totalBelanja > pembayaran) {
                System.out.println("Uang Anda Kurang");
>>>>>>> 2ab6741 (Update Cashier.java)
=======
            pembayaran = In.nextInt();  
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            //TODO: handle exception
        } 
        if (totalBelanja > pembayaran) {
            System.out.println("Uang Anda Kurang");
>>>>>>> 16f3961 (Update Cashier.java)
            } else {
                kembalian = pembayaran - totalBelanja;
                System.out.println("Total kembalian anda = " + kembalian);
                System.out.println("Dengan dengan rincian sebagai berikut :");
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                if (kembalian >= 100000) {
                    int pecahan = (kembalian / 100000);
                    kembalian -= (100000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 100.000");
                }
                if (kembalian >= 50000) {
                    int pecahan = (kembalian / 50000);
                    kembalian -= (50000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 50.000");
                }
                if (kembalian >= 20000) {
                    int pecahan = (kembalian / 20000);                    
                    kembalian -= (20000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 20.000");
                }
                if (kembalian >= 10000) {
                    int pecahan = (kembalian / 10000);                   
                    kembalian -= (10000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 10.000");
                }
                if (kembalian >= 5000) {
                    int pecahan = (kembalian / 5000);                    
                    kembalian -= (5000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 5000");
                }   
                if (kembalian >= 2000) {
                    int pecahan = (kembalian / 2000);                   
                    kembalian -= (2000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 2000");
                }
                if (kembalian >= 1000) {
                    int pecahan = (kembalian / 1000);                   
                    kembalian -= (1000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 1000");
                }
                if (kembalian >= 500) {
                    int pecahan = (kembalian / 500);
                    kembalian -= (500 * pecahan);
                    System.out.println(pecahan + " buah uang Rp. 500");
                }
                if (kembalian >= 200) {
                    int pecahan = (kembalian / 200);
                    kembalian -= (200 * pecahan); 
                    System.out.println(pecahan + " buah uang Rp. 200");
                }
                if (kembalian >= 100) {
                    int pecahan = (kembalian / 100);
                    kembalian -= (100 * pecahan);
                    System.out.println(pecahan + " buah uang Rp. 100");
=======
                int uangA,uangB,uangC,uangD,uangE,uangF,uangG,uangH,uangI,uangJ;
=======
                int uangA, uangB, uangC, uangD, uangE, uangF, uangG, uangH, uangI, uangJ;
>>>>>>> 2ab6741 (Update Cashier.java)
                uangA = 0;
                uangB = 0;
                uangC = 0;
                uangD = 0;
                uangE = 0;
                uangF = 0;
                uangG = 0;
                uangH = 0;
                uangI = 0;
                uangJ = 0;
    
=======
>>>>>>> 16f3961 (Update Cashier.java)
                if (kembalian >= 100000) {
                    int pecahan = (kembalian / 100000);
                    kembalian -= (100000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 100.000");
                }
                if (kembalian >= 50000) {
                    int pecahan = (kembalian / 50000);
                    kembalian -= (50000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 50.000");
                }
                if (kembalian >= 20000) {
                    int pecahan = (kembalian / 20000);                    
                    kembalian -= (20000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 20.000");
                }
                if (kembalian >= 10000) {
                    int pecahan = (kembalian / 10000);                   
                    kembalian -= (10000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 10.000");
                }
                if (kembalian >= 5000) {
                    int pecahan = (kembalian / 5000);                    
                    kembalian -= (5000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 5000");
                }   
                if (kembalian >= 2000) {
                    int pecahan = (kembalian / 2000);                   
                    kembalian -= (2000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 2000");
                }
                if (kembalian >= 1000) {
                    int pecahan = (kembalian / 1000);                   
                    kembalian -= (1000 * pecahan);
                    System.out.println(pecahan + " lembar uang Rp. 1000");
                }
                if (kembalian >= 500) {
                    int pecahan = (kembalian / 500);
                    kembalian -= (500 * pecahan);
                    System.out.println(pecahan + " buah uang Rp. 500");
                }
                if (kembalian >= 200) {
                    int pecahan = (kembalian / 200);
                    kembalian -= (200 * pecahan); 
                    System.out.println(pecahan + " buah uang Rp. 200");
                }
                if (kembalian >= 100) {
<<<<<<< HEAD
                    kembalian = kembalian - 100;
                    uangJ = uangJ + 1;
                }
                if (uangA > 0) {
                    System.out.println(uangA + " lembar uang Rp.100000");
                } 
                if (uangB > 0) {
                    System.out.println(uangB + " lembar uang Rp.50000");
                } 
                if (uangC > 0) {
                    System.out.println(uangC + " lembar uang Rp.20000");
                } 
                if (uangD > 0) {
                    System.out.println(uangD + " lembar uang Rp.10000");
                } 
                if (uangE > 0) {
                    System.out.println(uangE + " lembar uang Rp.5000");
                } 
                if (uangF > 0) {
                    System.out.println(uangF + " lembar uang Rp.2000");
                } 
                if (uangG > 0) {
                    System.out.println(uangG + " lembar uang Rp.1000");
                } 
                if (uangH > 0) {
                    System.out.println(uangH + " buah uang Rp.500");
                } 
                if (uangI > 0) {
                    System.out.println(uangI + " buah uang Rp.200");
                } 
                if (uangJ > 0) {
                    System.out.println(uangJ + " buah uang Rp.100");
                }
                if (kembalian > 0) {
                    System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
>>>>>>> 216d79c (Update Cashier.java)
=======
                    int pecahan = (kembalian / 100);
                    kembalian -= (100 * pecahan);
                    System.out.println(pecahan + " buah uang Rp. 100");
>>>>>>> 2ab6741 (Update Cashier.java)
                }
                In.close();
        
            }
<<<<<<< HEAD
<<<<<<< HEAD
        }
=======
       
>>>>>>> 2ab6741 (Update Cashier.java)
        In.close();
=======

>>>>>>> 16f3961 (Update Cashier.java)
    }
}
