package ip.syssrc.loop;

/**
 * FactorialSequence
 *
 * Assignment 2.2
 *
 * @author H071211087 - Syarif Hidayat <syarifdayat119@gmail.com>
 *
 */
import jav.util.Scanner;
public class FactorialSequence {

    public static void main(String[] args) {
        java.util.Scanner t2 = new Scanner(System.in);
        long fact = 1;
        int n = t2.nextInt();
        if (n>0){
            System.out.println(n+"!=");
            for (int i = n; i>=2;i--){
                System.out.println(i+"x");
                fact = fact*i;
            }
            System.out.println("1=" + fact);
        }else if (n==0){
            System.out.println(n + "!= ");
            System.out.println("1");
        }else{
            System.out.println("Error");
        }
            t2.close();
    }
}
