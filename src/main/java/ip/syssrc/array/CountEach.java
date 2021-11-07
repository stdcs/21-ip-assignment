package ip.syssrc.array;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211073 - Djulizah Bonita L
 *
 */
import java.util.Scanner;
public class CountEach {

    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);

        int n;
        System.out.print("Input n = ");
        n = Obj.nextInt();

        int[] memo = new int [n];

        //looping input until n
        for (int i = 0 ; i < n; i++ ) {
            memo [i] = Obj.nextInt();
        }

        //Array freq will store frequencies of element  
        int [] freq = new int [memo.length];  
        int visited = -1;  
     
        for(int i = 0; i < memo.length; i++){  
            int count = 1;  
            
            for(int j = i+1; j < memo.length; j++){  
                if(memo[i] == memo[j]){  
                    count++;  
                    
                    //To avoid counting same element again  
                    freq[j] = visited;  
                }  
            }  
            
            if(freq[i] != visited) {
                freq[i] = count;  
            }  
        
            if(freq[i] != visited) {  
                System.out.println(freq[i] + " Angka " + memo[i]);  
            }

        }
        
        Obj.close();
    }
}
