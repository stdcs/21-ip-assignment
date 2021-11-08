package ip.syssrc.array;
/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211068 - Michael Gabriel Bida <michaelgabriel663@gmail.com> *
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
       
        int[] arr = { 2, 3, 5, 4, 8, 7, 11, 13, 15, 19, 25, 22};

        int sumOfOneThirdLength = 0;

        int space = 0;
        int biggestNumber = arr[arr.length - 1];
        while (biggestNumber > 0) {
            biggestNumber /= 10;
            space++;
        }

        for (int i = 0; i < (arr.length / 3); i++) {
            
            int oneThirdOfArr = arr.length / 3;
            int second = i + oneThirdOfArr;
            int third = i + 2 * oneThirdOfArr;

            int sum = arr[i] + arr[second] + arr[(third)];

            System.out.printf("%" + space + "d + " + "%" + space + "d + " + "%" + space + "d = %d\n", arr[i],
                    arr[second], arr[third], sum);
            sumOfOneThirdLength += sum;

            if (i == oneThirdOfArr - 1 && arr.length % 3 >= 1) {
                i = ++third;
                boolean finished = (arr.length % 3 == 2) ? false : true;
                sum = (!finished) ? arr[i] + arr[arr.length - 1] : arr[i];

                System.out.printf("%" + space + "d%s%d\n", arr[i],
                        (!finished) ? " + " + arr[++i] + " = " : " = ", sum);

                sumOfOneThirdLength += sum;
            }
        }

        System.out.print("\nSum of ");
        for (int j = 0; j < arr.length; j++) {
            System.out.printf("[%d]", arr[j]);
        }
        System.out.printf(" = %d", sumOfOneThirdLength);
    }
}