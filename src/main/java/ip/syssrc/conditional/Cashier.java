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
<<<<<<< HEAD
        int totalBelanja = 0;
        int kembalian = 0;
        int pembayaran = 0;
        try {
            totalBelanja = In.nextInt();
            System.out.println("Berapa total uang anda bayarkan ? ");
            pembayaran = In.nextInt();  
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            //TODO: handle exception
        } 
        if (totalBelanja > pembayaran) {
            System.out.println("Uang Anda Kurang");
            } else {
                kembalian = pembayaran - totalBelanja;
                System.out.println("Total kembalian anda = " + kembalian);
                System.out.println("Dengan dengan rincian sebagai berikut :");
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
                }
                In.close();
        
            }
=======
>>>>>>> fb91584 (Update src/main/java/ip/syssrc/conditional/Cashier.java)

        int totalBelanja = In.nextInt();
        
        System.out.println("Berapa total uang anda bayarkan ? ");

        int pembayaran = In.nextInt();

        if (totalBelanja > pembayaran) {
            System.out.println("Uang Anda Kurang");
        } else {
            int kembalian = pembayaran - totalBelanja;
            System.out.println("Total kembalian anda = " + kembalian);
            System.out.println("Dengan dengan rincian sebagai berikut :");
            int a,b,c,d,e,f,g,h,i,j;
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            g = 0;
            h = 0;
            i = 0;
            j = 0;

            if (kembalian >= 100000) {
                kembalian = kembalian - 100000;
                a = a + 1;
            }
            if (kembalian >= 50000) {
                kembalian = kembalian - 50000;
                b = b + 1;
            }
            if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                c = c + 1;
            }
            if (kembalian >= 20000) {
                kembalian = kembalian - 20000;
                c = c + 1;
            }
            if (kembalian >= 10000) {
                kembalian = kembalian - 10000;
                d = d + 1;
            }
            if (kembalian >= 5000) {
                kembalian = kembalian - 5000;
                e = e + 1;
            }   
            if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                f = f + 1;
            }
            if (kembalian >= 2000) {
                kembalian = kembalian - 2000;
                f = f + 1;
            }
            if (kembalian >= 1000) {
                kembalian = kembalian - 1000;
                g = g + 1;
            }
            if (kembalian >= 500) {
                kembalian = kembalian - 500;
                h = h + 1;
            }
            if (kembalian >= 200) {
                kembalian = kembalian - 200;
                i = i + 1;
            }
            if (kembalian >= 200) {
                kembalian = kembalian - 200;
                i = i + 1;
            }
            if (kembalian >= 100) {
                kembalian = kembalian - 100;
                j = j + 1;
            }
            if (a > 0) {
                System.out.println(a + " lembar uang Rp.100000");
            } 
            if (b > 0) {
                System.out.println(b + " lembar uang Rp.50000");
            } 
            if (c > 0) {
                System.out.println(c + " lembar uang Rp.20000");
            } 
            if (d > 0) {
                System.out.println(d + " lembar uang Rp.10000");
            } 
            if (e > 0) {
                System.out.println(e + " lembar uang Rp.5000");
            } 
            if (f > 0) {
                System.out.println(f + " lembar uang Rp.2000");
            } 
            if (g > 0) {
                System.out.println(g + " lembar uang Rp.1000");
            } 
            if (h > 0) {
                System.out.println(h + " lembar uang Rp.500");
            } 
            if (i > 0) {
                System.out.println(i + " lembar uang Rp.200");
            } 
            if (j > 0) {
                System.out.println(j + " lembar uang Rp.100");
            }
            if (kembalian > 0) {
                System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
            }

        
        }
        In.close();
    }
}
