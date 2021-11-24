package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211065 - Asehpryanto Rari Parinding <Asehpryantorari@gmail.com>
 *
 */
public class Eyes {

    public static void main(String[] args) {
        Scanner bk = new Scanner(System.in);
<<<<<<< HEAD
        int n = bk.nextInt();
        bk.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        } 
    } 
}

>>>>>>> 9a9d39e (feat(loop): add assigment)
