package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211064 - Agung Kartika Ardhiyanda <agungardhiyanda25@gmail.com>
 *
 */
import java.util.Scanner;
public class CountEach {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ukuran,i,j,hitung;

        System.out.print("Input Size N = ");
        ukuran = sc.nextInt();
        int a[] = new int[ukuran];
        int jumlah[] = new int[ukuran];

        System.out.println(" ")
        for (i = 0; i < ukuran; i++){
            a[i] = sc.nextInt();
            jumlah[i] = -1;
        }
        for ( i= 0; i < ukuran; i++){
            hitung= 1;
            for(j = i + 1; j < ukuran; j++){
                if(a[i] == a[j]){
                    hitung++;
                    jumlah[j] = 0;
                }
                if(jumlah[i] !=0){
                    jumlah[i] = hitung;
                }
        }
        for (i = 0; i < ukuran; i++){
            if(jumlah[i] !=0){
                System.out.println(jumlah[i]+" Angka "+a[i]);
            }
        }
        }

    

    }
}
