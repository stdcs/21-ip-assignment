package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071171512 - Diza Alysha Zahra <dizalysha@gmail.com>

 * @author H071211086 - Diza Alysha Zahra <dizalysha@gmail.com>

 *
 */

 public class CountEach {

    public static void main(String[] args) {
        Scanner dz = new Scanner(System.in);
        int n = dz.nextInt();
        int[] array = new int[10000000];
        for (int i = 0; i < n; i++) {
            int var = dz.nextInt();
            array[var]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {

            } else {
                System.out.println(array[i] + " angka " + i);
            }
        }
    }
}