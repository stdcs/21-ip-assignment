package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211071 - Muhammad Dzacky Ilham <dzackyilham01@gmail.com>
 *
 */
public class Eyes {

    public static void main(String[] args) {

        Scanner tugas2 = new Scanner(System.in);

        int n = tugas2.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
    

