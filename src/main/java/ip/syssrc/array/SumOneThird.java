package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211072 - Dewa Rescue Virgiawansyah <dr3scue2003@gmail.com>
 *
 */
public class SumOneThird {
    public static void main(String[] args) {
        int[] arr = { 67, 74, 100, 88, 98, 13, 81, 40, 7, 49, 87, 16, 90, 62, 41, 15, 5 };
        int sumWithOneThirdLength = 0;

        /** Mengurutkan array */
        for (int i = 0; i < arr.length; i++) {
            int subs;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    subs = arr[i];
                    arr[i] = arr[j];
                    arr[j] = subs;
                }
            }
        }

        /** Agar angka yang di print rata kanan */
        int biggestNumber = arr[arr.length - 1];
        int space = 0;
        while (biggestNumber > 0) {
            biggestNumber /= 10;
            space++;
        }

        for (int i = 0; i < arr.length / 3; i++) {
            // Your Magic is Here
            int oneThirdOfArr = arr.length / 3;
            int sum = 0;
            int j = i;

            for (int k = 0; k < 3; k++) {
                sum += arr[j];
                System.out.printf("%s%" + space + "d", (j != i) ? " + " : "", arr[j]);
                j += oneThirdOfArr;
            }
            System.out.printf(" = %d\n", sum);

            sumWithOneThirdLength += sum;

            if (i == (oneThirdOfArr - 1)) {
                sum = 0;
                for (int k = oneThirdOfArr * 3; k < arr.length; k++) {
                    sum += arr[k];
                    System.out.printf("%" + space + "d%s", arr[k], (k != arr.length - 1) ? " + " : " = " + sum + "\n");
                }
                System.out.printf("\n");
                sumWithOneThirdLength += sum;
            }
        }

        System.out.print("Sum of ");
        for (int j = 0; j < arr.length; j++) {
            System.out.printf("[%d]", arr[j]);
        }
        System.out.printf(" = %d", sumWithOneThirdLength);
    }
}