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
        // First statements
        int[] arr = { 55, 60, 75, 80, 95, 100, 95, 80, 75, 60, 55, 45 };
        int length = arr[arr.length - 1];
        int arrangedArray;
        int arrayIndex = 0;
        int arrayTotal = 0;
        int preTotal = 0;
        int opt = 0;
    
        // Sorting out array
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arrangedArray = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arrangedArray;
                }
            }
        }

        // Align the array by the right side
        while (length > 0) {
            length /= 10;
            ++opt;
        }
        
        // Array operation
        for (int i = 0; i < (arr.length / 3); i++) {
            int oneThird = (arr.length / 3);
            arrayIndex = i; // Return the arrayIndex to become i for every increment
            for (int t = 0; t < 3; t++) {
                preTotal += arr[arrayIndex];
                System.out.printf("%s%" + opt + "d", (arrayIndex != i) ? " + " : "", arr[arrayIndex]);
                arrayIndex += oneThird;
            }
            arrayTotal += preTotal;
            System.out.print(" = " + preTotal + "\n");

            if ((i + 1) == oneThird) { // The possible outcome calculations for every index
                preTotal = 0;
                for (int t = oneThird * 3; t < arr.length; t++) {
                    preTotal += arr[t];
                    System.out.printf("%" + opt + "d%s", arr[t], (t != arr.length - 1) ? " + " : " = " + preTotal + "\n");
                }
                System.out.print("\n");
                arrayTotal += preTotal;
            }
        }

        // Result
        System.out.print("Sum of ");
        for (int i = 1; i < arr.length; i++) { // Showing every array index by print out
            System.out.print("[" + i + "]");
        }
        System.out.print(" = " + arrayTotal);
    }
}
