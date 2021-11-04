package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211059 - Muhammad Erwin Arif <muherwinarif31@gmail.com>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        for (int index = 0; index < (arr.length / 3); index++) {
            // Your magic is here
            int oneThirdOfArr = arr.length / 3;
            int sum = 0;
            int i = index;

            /** Menghitung jumlah digit terbesar */
            int space = 0;
            int biggestNumber = arr[arr.length - 1];
            while (biggestNumber > 0) {
                biggestNumber /= 10;
                space++;
            }

            for (int k = 0; k < 3; k++) {
                sum += arr[i];
                System.out.printf("%s%" + space + "d", (i != index) ? " + " : "", arr[i]);
                i += oneThirdOfArr;
            }

            System.out.printf(" = %d\n", sum);

            if (index == (oneThirdOfArr - 1)) {
                sum = 0;
                for (int j = oneThirdOfArr * 3; j < arr.length; j++) {
                    sum += arr[j];
                    System.out.printf("%" + space + "d%s", arr[j], (j != arr.length - 1) ? " + " : " = " + sum + "\n");
                }
                System.out.printf("\n");

                System.out.print("Sum of ");
                sum = 0;
                for (int k = 0; k < arr.length; k++) {
                    System.out.printf("[%d]", arr[k]);
                    sum += arr[k];
                }
                System.out.printf(" = %d", sum);
            }
        }
    }
}
