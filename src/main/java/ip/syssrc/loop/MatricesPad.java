package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 * @author H071211041 - Fathur Rachman Alamsyag <sembarangm135@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 3455b10 (feat(loop): add assignment)
=======
 * @author H071211041 - Fathur Rachman Alamsyag <sembarangm135@gmail.com>
>>>>>>> 2d0a2cf (feat(loop):fix)
=======
 * @author H071211041 - Fathur Rachman Alamsyag <sembarangm135@gmail.com>
>>>>>>> ca5cb89ea2cfe1e485790b102e9b6b90693e0ec9
 *
 */
import java.util.Scanner;

public class MatricesPad {

    public static void main(String[] args) {

        Scanner t2 = new Scanner(System.in);

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        System.out.println("Input Angka Awal, Akhir, dan Ukuran (Max is Integer Value '2147483647')");
        int start = t2.nextInt();
        int end = t2.nextInt();
        int size = t2.nextInt();
        int awal = start;
        if (end >= start) {
            while (end >= start) {
                for (int i = 0; i < size; i++) {
                    if (start == end) {
                        break;
                    }
                    if (start < 10) {
                        System.out.print("0" + start + " ");
                    } else {
                        System.out.print(start + " ");
                    }
                    start++;
                }
                if (start == end) {
                    if ((awal - end) % size == 0) {
                        if (start < 10) {
                            System.out.println("");
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println("");
                            System.out.println(start);
                            break;
                        }
                    } else {
                        if (start < 10) {
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println(start);
                            break;
                        }
                    }
                }
                System.out.println();
            }
        }

        else {
            while (start >= end) {
                for (int i = 0; i < size; i++) {
                    if (start == end) {
                        break;
                    }
                    if (start < 10) {
                        System.out.print("0" + start + " ");
                    } else {
                        System.out.print(start + " ");
                    }
                    start--;
                }
                if (start == end) {
                    if ((awal - end) % size == 0) {
                        if (start < 10) {
                            System.out.println("");
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println("");
                            System.out.println(start);
                            break;
                        }
                    } else {
                        if (start < 10) {
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println(start);
                            break;
                        }
                    }
                }
                System.out.println();
            }
        }
        t2.close();
    }
}
=======
=======
        System.out.println("Input Angka Awal, Akhir, dan Ukuran (Max is Integer Value '2147483647')");
>>>>>>> 2d0a2cf (feat(loop):fix)
=======
        System.out.println("Input Angka Awal, Akhir, dan Ukuran (Max is Integer Value '2147483647')");
>>>>>>> ca5cb89ea2cfe1e485790b102e9b6b90693e0ec9
        int start = t2.nextInt();
        int end = t2.nextInt();
        int size = t2.nextInt();
        int awal = start;
        if (end >= start) {
            while (end >= start) {
                for (int i = 0; i < size; i++) {
                    if (start == end) {
                        break;
                    }
                    if (start < 10) {
                        System.out.print("0" + start + " ");
                    } else {
                        System.out.print(start + " ");
                    }
                    start++;
                }
                if (start == end) {
                    if ((awal - end) % size == 0) {
                        if (start < 10) {
                            System.out.println("");
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println("");
                            System.out.println(start);
                            break;
                        }
                    } else {
                        if (start < 10) {
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println(start);
                            break;
                        }
                    }
                }
                System.out.println();
            }
        }

        else {
            while (start >= end) {
                for (int i = 0; i < size; i++) {
                    if (start == end) {
                        break;
                    }
                    if (start < 10) {
                        System.out.print("0" + start + " ");
                    } else {
                        System.out.print(start + " ");
                    }
                    start--;
                }
                if (start == end) {
                    if ((awal - end) % size == 0) {
                        if (start < 10) {
                            System.out.println("");
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println("");
                            System.out.println(start);
                            break;
                        }
                    } else {
                        if (start < 10) {
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println(start);
                            break;
                        }
                    }
                }
                System.out.println();
            }
        }
        t2.close();
    }
<<<<<<< HEAD
<<<<<<< HEAD
}
>>>>>>> 3455b10 (feat(loop): add assignment)
=======
}
>>>>>>> 2d0a2cf (feat(loop):fix)
=======
}
>>>>>>> ca5cb89ea2cfe1e485790b102e9b6b90693e0ec9
