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
<<<<<<< HEAD
<<<<<<< HEAD
        Scanner bk = new Scanner(System.in);
<<<<<<< HEAD
        int n = bk.nextInt();
        bk.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
=======
        Scanner in = new Scanner(System.in);
=======
        Scanner bk = new Scanner(System.in);
>>>>>>> a089113 (feat(loop/MatricesPad): add code)

        int n = bk.nextInt();
        bk.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
>>>>>>> dc0ff31 (feat(loop): add assingment)
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
