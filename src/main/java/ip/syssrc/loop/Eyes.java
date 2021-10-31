package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211083 - Liska Dewi Rombe <rombeliska@gmail.com>
 *
 */
public class Eyes {

    public static void main(String[] args) {
        Scanner li = new Scanner(System.in);

        int n = li.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                    System.out.printf("%d%s", (i == j) ? 1 :0, (j <= n) ? " " : "\n");
                System.out.printf("%d%s", (i == j) ? 1 : 0, (j <= n) ? " " : "\n");
        
        }
        
        System.out.println();
    
     }
     
    }
}


        
    
