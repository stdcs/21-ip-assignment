package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211087 - Syarif Hidayat <syarifdayat119@gmail.com>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int SumOneThird = 0;

        /**Menghitung sum digit terbesar */
        int space = 0;
        int biggest = arr[arr.length - 1];
        while (biggest > 0) {
            biggest /= 10;
            space++;
        }
        for (int index = 0; index < (arr.length / 3); index++) {
            int OneThird = arr.length / 3;
            int second = index + OneThird;
            int third = index + 2 * OneThird;

            int sum = arr[index] + arr[second] + arr[(third)];

            System.out.printf("%" + space + "d + " + "%" + space + "d + " + "%" + space + "d = %d\n", arr[index],
                arr[second], arr[third], sum);
            SumOneThird += sum; 

            if (index == OneThird - 1 && arr.length % 3 >= 1) {
                index = ++third;
                boolean finish = (arr.length % 3 == 2) ? false : true;
                sum = (!finish) ? arr[index] + arr[arr.length - 1] : arr[index];

                System.out.printf("%" + space + "d%s%d\n", arr[index], (!finish) ? " + " + arr[++index] + " = " : " = ", sum);

                SumOneThird += sum;
            }
        }
        System.out.print("\nSum of ");
        for(int i = 0; i < arr.length; i++){
                System.out.printf("[%d]", arr[i]);
        }
        System.out.printf(" = %d", SumOneThird);
    }
}
