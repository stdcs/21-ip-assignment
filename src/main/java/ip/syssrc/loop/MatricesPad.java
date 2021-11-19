package ip.syssrc.loop;
import java.util.Scanner;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 * @author H071211078 Muh Fajar Siddiq <fsiddiq072@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
 * @author H071211078 Muh Fajar Siddiq <fsiddiq072@gmail.com>
>>>>>>> 9cf23f9 (Update MatricesPad.java)
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> c9b229e (feat(loop) : add assigment 2.1 2.2 2.3)
=======
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
>>>>>>> 1392ebd (Update MatricesPad.java)
=======
 * @author H071211078 Muh Fajar Siddiq <fsiddiq072@gmail.com>
>>>>>>> c1f7cd4 (fix(conditional);(loop) resolved merge conflict)
 *
 */
public class MatricesPad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> c779b60 (feat(loop): input no longer be limited to 3 digits)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b2bc0b4 (feat(loop): input no longer be limited to 3 digits)
=======
>>>>>>> c1f7cd4 (fix(conditional);(loop) resolved merge conflict)
        int start = 0;
        int end = 0;
        int size = 0;
        try {
            start = in.nextInt();
            end = in.nextInt();
            size = in.nextInt();
            in.close();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c1f7cd4 (fix(conditional);(loop) resolved merge conflict)

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
<<<<<<< HEAD
=======
=======
>>>>>>> b2bc0b4 (feat(loop): input no longer be limited to 3 digits)
=======
>>>>>>> c9b229e (feat(loop) : add assigment 2.1 2.2 2.3)
=======
>>>>>>> c779b60 (feat(loop): input no longer be limited to 3 digits)

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
<<<<<<< HEAD
<<<<<<< HEAD
}
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
}
>>>>>>> 5d9c4a0 (fix(loop/MatricesPad): removed spaces in last line)
=======
}
>>>>>>> c9b229e (feat(loop) : add assigment 2.1 2.2 2.3)
=======
}
<<<<<<< HEAD
=======
>>>>>>> 509d200 (feat(loop) : add assigment 2.1 2.2 2.3)
=======
}
>>>>>>> 5d9c4a0 (fix(loop/MatricesPad): removed spaces in last line)
>>>>>>> 13f35b8 (fix(loop/MatricesPad): removed spaces in last line)
>>>>>>> f6a0379 (fix(loop/MatricesPad): removed spaces in last line)
=======
>>>>>>> c1f7cd4 (fix(conditional);(loop) resolved merge conflict)
