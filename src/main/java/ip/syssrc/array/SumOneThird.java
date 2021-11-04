package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211044 - Adelia Puspita Hilal <adhepuspita123@gmail.com>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        for (int index = 0; index < (arr.length / 3); index++) {
            // Your magic is here
            Scanner in = new Scanner(System.in);
            int sum;
            int n = in.nextInt();
            int aritmatika = (n/3);
            int[] array = new int[n];
            for (int i=0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
    
            for(int i = 0; i < n/3; i++) {
                sum = 0;
                for (int j = 0; j < 3; j++ ) {
                    int deret = i + (j * aritmatika);
                    sum = sum + array[deret];
                    if (j == 2) {
                        System.out.println(array[deret] + " = " + sum);;
                    } else {
                        System.out.print(array[deret] + " + ");
                    }
                }
            }
            if (n%3 > 0) {
                sum = 0;
                for (int i = ((n/3) * 3); i < n; i++) {
                    sum = sum + array[i];
                    if (i == n-1) {
                        System.out.print(array[i] + " = " + sum);
                    } else {
                        System.out.print(array[i] + " + ");
                    }
                }
            }
            in.close();
        }
    }
    
        }
    }
}
