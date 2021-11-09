package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        
        for (int index = 0; index < (arr.length / 3); index++) {
            // Your magic is here
            int oneThird = arr.length / 3;
            int jumlah = 0;
            int i = index;
            int spasi = 0;
            int angkaTerbesar = arr[arr.length -1];

            while (angkaTerbesar > 0){
                angkaTerbesar /= 10;
                spasi++;
            }

            for (int j = 0; j <3; j++){
                jumlah += arr[i];
                System.out.printf("%s%"+spasi+"d", (i!=index) ?" +" : "",arr[i]);
                i +=oneThird;
            }
            System.out.printf(" = %d\n", jumlah);

            if (index ==(oneThird - 1)){
                jumlah = 0;
                for(int k = oneThird * 3; k < arr.length; k++){
                    jumlah += arr[k];
                    System.out.printf("%"+spasi+"d%s",arr[k],(k!=arr.length - 1) ? "+":"="+ jumlah +"\n");
                }
            System.out.printf("\n");

            System.out.print("Jumlah ");
            jumlah = 0;
            for(int x = 0; x < arr.length; x++){
                System.out.printf("[%d]",arr[x]);
                jumlah +=arr[x];
            }
            System.out.printf(" = %d",jumlah);
         }
     }
  }
}