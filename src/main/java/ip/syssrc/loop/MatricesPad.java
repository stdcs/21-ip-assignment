package ip.syssrc.loop;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9666785 (feat(loop\MatricesPad.java): add try catch statement)
import java.util.InputMismatchException;
import java.util.Scanner;
=======

>>>>>>> 1411adb (feat(loop):add new java file)
=======
import java.util.Scanner;
>>>>>>> 40ad29a (feat(conditional/MatricesPad.java): add 'import java.util.Scanner' object)
/**
 * MatricesPad
 *
 * Assignment 2.1
 *
<<<<<<< HEAD
<<<<<<< HEAD
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 1411adb (feat(loop):add new java file)
=======
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
>>>>>>> f63244b (feat(loop/MatricesPad.java):rename the author)
 *
 */

public class MatricesPad {

    public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int size = in.nextInt();
        
        int start, size, end;

        try{
            System.out.println("Input nilai awal");
            start = in.nextInt();
            System.out.println("Input nilai akhir");
            end = in.nextInt();
            System.out.println("Input panjang baris");
            size = in.nextInt();
            
            if (start < 0 || end < 0 || size < 0){
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("Input bilangan positif atau 0!");
            return;
        }
        
        int range = end - start;
        int temp = start;
        
        if (start < 10 && end < 10 ){
            if (range >= 0 ){
                for (int i = 1; i <= range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("%01d ", temp);
                        temp++;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= range % size; k++){
                    System.out.printf("%01d ", temp);
                    temp++;
                }
            } else if (range <= 0){
                for (int i = 1; i <= -range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("%01d ", temp);
                        temp--;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= -range % size; k++){
                    System.out.printf("%01d ", temp);
                    temp--;
                }
            }   
        } else if (start < 100 & end < 100){
            if (range >= 0){
                for (int i = 1; i <= range / size; i++){
                    for (int j= 1; j <= size; j++){
                        System.out.printf("%02d ", temp);
                        temp++;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= range % size; k++){
                    System.out.printf("%02d ", temp);
                    temp++;
                }
            } else if (range <= 0){
                for (int i = 1; i <= -range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("%02d ", temp);
                        temp--;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= - range % size; k++){
                    System.out.printf("%02d ", temp);
                    temp--;
                }
            }
        } else if (start < 1000 && end < 1000){
            if (range >= 0){
                for (int i = 1; i <= range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("%03d ", temp);
                        temp++;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= range % size; k++){
                    System.out.printf("%03d ", temp);
                    temp++;
                }
            } else if (range <= 0){
                for (int i = 1; i <= -range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("03d ", temp);
                        temp--;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= -range % size; k++){
                    System.out.printf("%03d ", temp);
                    temp--;
                }
            }
        }
        in.close();
=======
        Scanner in = new Scanner(System.in);
<<<<<<< HEAD
        int start = in.nextInt();
        int end = in.nextInt();
        int size = in.nextInt();
=======
        
        int start, size, end;
>>>>>>> bcf11fe (feat(loop\MatricesPad.java): add try catch statement)

        try{
            System.out.println("Input nilai awal");
            start = in.nextInt();
            System.out.println("Input nilai akhir");
            end = in.nextInt();
            System.out.println("Input panjang baris");
            size = in.nextInt();
            
            if (start < 0 || end < 0 || size < 0){
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("Input bilangan positif atau 0!");
            return;
        }
        
        int range = end - start;
        int temp = start;
        
<<<<<<< HEAD
>>>>>>> 40ad29a (feat(conditional/MatricesPad.java): add 'import java.util.Scanner' object)
    }
}
=======

    }
}
>>>>>>> 1411adb (feat(loop):add new java file)
=======
        if (start < 10 && end < 10 ){
            if (range >= 0 ){
                for (int i = 1; i <= range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("%01d ", temp);
                        temp++;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= range % size; k++){
                    System.out.printf("%01d ", temp);
                    temp++;
                }
            } else if (range <= 0){
                for (int i = 1; i <= -range / size; i++){
                    for (int j = 1; j <= size; j++){
                        System.out.printf("%01d ", temp);
                        temp--;
                    }
                    System.out.println(" ");
                }
                for (int k = 0; k <= -range % size; k++){
                    System.out.printf("%01d ", temp);
                    temp--;
                }
            }   
        }
        in.close();
    }
<<<<<<< HEAD
}

>>>>>>> 9bed9be (feat(loop\MatricesPad.java):add if else statement)
=======
}
>>>>>>> 9666785 (feat(loop\MatricesPad.java): add try catch statement)
