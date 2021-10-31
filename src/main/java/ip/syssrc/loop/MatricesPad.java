package ip.syssrc.loop;
import java.util.Scanner;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
<<<<<<< HEAD
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
=======
<<<<<<< HEAD
<<<<<<< HEAD
 * @author H071211078 Muh Fajar Siddiq <fsiddiq072@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
 * @author H071211078 Muh Fajar Siddiq <fsiddiq072@gmail.com>
>>>>>>> 9cf23f9 (Update MatricesPad.java)
>>>>>>> ebbaf64 (Update MatricesPad.java)
 *
 */
public class MatricesPad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b2bc0b4 (feat(loop): input no longer be limited to 3 digits)
        int start = 0;
        int end = 0;
        int size = 0;
        try {
            start = in.nextInt();
            end = in.nextInt();
            size = in.nextInt();
            in.close();
<<<<<<< HEAD

            if(start < 0 || end < 0 || size <0){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Tolong masukkan input Bilangan Bulat >= 0");
            return;
            //TODO: handle exception
        }

        /**leading zero */
        int max = (start > end) ? start : end;
        int leadZero = 0;
        while (max > 0) {
            max /= 10;
            leadZero++;
        }
        /**OUTPUT */
        for (int i = start, j = 1; (start < end ? i <= end : i >= end); j++) {
            System.out.printf("%0" + leadZero + "d%s", i
            , ((j % size == 0 && j != 0) || i == end) ? "\n" : " ");
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }
    }
}
=======
=======
>>>>>>> b2bc0b4 (feat(loop): input no longer be limited to 3 digits)
>>>>>>> 196a7bf (feat(loop): input no longer be limited to 3 digits)

            if(start < 0 || end < 0 || size <0){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Tolong masukkan input Bilangan Bulat >= 0");
            return;
            //TODO: handle exception
        }

        /**leading zero */
        int max = (start > end) ? start : end;
        int leadZero = 0;
        while (max > 0) {
            max /= 10;
            leadZero++;
        }
        /**OUTPUT */
        for (int i = start, j = 1; (start < end ? i <= end : i >= end); j++) {
            System.out.printf("%0" + leadZero + "d%s", i
            , ((j % size == 0 && j != 0) || i == end) ? "\n" : " ");
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }
    }
<<<<<<< HEAD
}
<<<<<<< HEAD
=======
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
}
>>>>>>> 5d9c4a0 (fix(loop/MatricesPad): removed spaces in last line)
>>>>>>> 13f35b8 (fix(loop/MatricesPad): removed spaces in last line)
