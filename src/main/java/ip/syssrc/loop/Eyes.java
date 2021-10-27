package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211064 - Agung Kartika Ardhiyanda <agungardhiyanda25@gmail.com>
 *
 */
import java.util.Scanner;
public class Eyes {

    public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
        Scanner sc = new Scanner (System.in);
        
        int n;
        System.out.print("Input N = ");
        n = sc.nextInt();
      
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j < n - 1) ? " " : "\n");
            }
            sc.close();
        }
    }
 }
       
=======
        Scanner sc = new Scanner(System.in);

=======
        Scanner sc = new Scanner (System.in);
>>>>>>> 92ebbb8 (feature(loop/Eyes): Add scanner object, Add for looping)
        
        int n;
        System.out.print("Input N = ");
        n = sc.nextInt();

        for(i = 0; i<n; i++) {
            for(int j = 0; j < n; j++){
                if( i == j){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
        }
        System.out.print("\n");
        sc.close();
    }
}
>>>>>>> ef38dbc (feature(looping/Eyes): Add Scanner object)
