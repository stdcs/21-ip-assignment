package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211045 - MUHAMMAD SOFYAN DAUD PUJAS <H071211045>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        // Our first statements (the array is changeable)
        int[] arr = { 55, 60, 75, 80, 95, 100, 95, 80, 75, 60, 55, 45, 65, 70 };
        int arrayEnd = arr[arr.length - 1];
        int arrayTotal = 0;
        int max = arr[0];
        int opt = 0;

        // Searching out for the biggest number
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Align the numbers to right side according to the biggest number
        while (max > 0) {
            max /= 10;
            ++opt;
        }
        
        // Array Sum operation
        for (int i = 0; i < (arr.length / 3); i++) {
            int oneThird = (arr.length / 3);
            int secNumber = oneThird + i;
            int thirdNumber = (2 * oneThird) + i;
            int preTotal = arr[i] + arr[secNumber] + arr[thirdNumber];
            arrayTotal += preTotal;

            // Printout for every first 3 length of the array
            System.out.printf("%" + opt + "d + %" + opt + "d + ", arr[i], arr[secNumber]);
            System.out.printf("%" + opt + "d", arr[thirdNumber]);
            System.out.print(" = " + preTotal + "\n");

            // Prinout for the last one or two length of the array
            if (arr.length % 3 > 0 && i + 1 == oneThird) {
                i = thirdNumber + 1;
                if (arr.length % 3 == 2) {
                    preTotal = arr[i] + arrayEnd;
                    System.out.printf("%" + opt + "d + %" + opt + "d = %s\n", arr[i], arr[i+1], preTotal);
                } else {
                    preTotal = arr[i];
                    System.out.printf("%" + opt + "d = %s\n", arr[i], preTotal);

                }
                arrayTotal += preTotal;
            }
        }
        // Result
        System.out.print("\nSum of ");
        for (int i = 1; i < arr.length; i++) {
            System.out.print("[" + i + "]");
        }
        System.out.print(" = " + arrayTotal);
    }
}
