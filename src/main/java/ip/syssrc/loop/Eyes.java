package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211087 - Syarif Hidayat <syarifdayat119@gmail.com>
 *
 */
import java.util.Scanner;
public class Eyes {

    public static void main(String[] args) {
        Scanner t2 = new Scanner(System.in);
        int n = t2.nextInt();
        for (int i = 1;i<=n; i++){
            for (int j = 1; j<=n; j++){
                if (i== j){
                    System.out.print(1+"");
                }else{
                    System.out.print(0 +"");
                }
            
                System.out.println();
            }
        }
    }
}
