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
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };

        int sumOfOneThirdLength = 0;

        /** Menghitung jumlah digit terbesar */
        int space = 0;
        int biggestNumber = arr[arr.length - 1];
        while (biggestNumber > 0) {
            biggestNumber /= 10;
            space++;
        }

        for (int index = 0; index < (arr.length / 3); index++) {
            // Your magic is here
            int oneThirdOfArr = arr.length / 3;
            int second = index + oneThirdOfArr;
            int third = index + 2 * oneThirdOfArr;

            int sum = arr[index] + arr[second] + arr[(third)];

            System.out.printf("%" + space + "d + " + "%" + space + "d + " + "%" + space + "d = %d\n", arr[index],
                    arr[second], arr[third], sum);
            sumOfOneThirdLength += sum;

            if (index == oneThirdOfArr - 1 && arr.length % 3 >= 1) {
                index = ++third;
                boolean finished = (arr.length % 3 == 2) ? false : true;
                sum = (!finished) ? arr[index] + arr[arr.length - 1] : arr[index];

                System.out.printf("%" + space + "d%s%d\n", arr[index],
                        (!finished) ? " + " + arr[++index] + " = " : " = ", sum);

                sumOfOneThirdLength += sum;
            }
        }

        System.out.print("\nSum of ");
        for (int k = 0; k < arr.length; k++) {
            System.out.printf("[%d]", arr[k]);
        }
        System.out.printf(" = %d", sumOfOneThirdLength);
    }
}
