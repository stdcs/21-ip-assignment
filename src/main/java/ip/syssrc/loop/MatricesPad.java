package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211083 - Liska Dewi Rombe <rombeliska@gmail.com>
 *
 */

public class MatricesPad {

    public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 911945ebeb7ab89f2288e27a05b66a102742839e
        Scanner li = new Scanner(System.in);

        int start = li.nextInt();
        int end = li.nextInt();
        int size = li.nextInt();
<<<<<<< HEAD
=======
        Scanner lio = new Scanner(System.in);

        int start = lio.nextInt();
        int end = lio.nextInt();
        int size = lio.nextInt();
>>>>>>> d8ab39a (feat (loop/Eyes):add code2)
=======
        Scanner li = new Scanner(System.in);

        int start = li.nextInt();
        int end = li.nextInt();
        int size = li.nextInt();
>>>>>>> 316d1d2 (feat (loop/MatricesPad): add code2)
=======
>>>>>>> 911945ebeb7ab89f2288e27a05b66a102742839e

        int range = end - start;
        int temp = start;

        if (start <= 9 && end <= 9) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%01d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= range % size; k++) {
                    System.out.printf("%01d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%01d ", temp);
                        temp--;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= -range % size; k++) {
                    System.out.printf("%01d ", temp);
                    temp--;
                }
            }
        } else if (start <= 99 && end <= 99) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%02d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= range % size; k++) {
                    System.out.printf("%02d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%02d ", temp);
                        temp--;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= -range % size; k++) {
                    System.out.printf("%02d ", temp);
                    temp--;
                }
            }
        } else if (start <= 999 && end <= 999) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%03d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= range % size; k++) {
                    System.out.printf("%03d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%03d ", temp);
                        temp--;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= -range % size; k++) {
                    System.out.printf("%03d ", temp);
                    temp--;
                }
            }
        }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        li.close();
=======
        lio.close();
>>>>>>> d8ab39a (feat (loop/Eyes):add code2)
=======
        li.close();
>>>>>>> 316d1d2 (feat (loop/MatricesPad): add code2)
=======
        li.close();
>>>>>>> 911945ebeb7ab89f2288e27a05b66a102742839e
    }
    
    }
