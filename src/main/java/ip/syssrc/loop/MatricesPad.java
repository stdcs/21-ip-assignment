package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211086 - Diza Alysha Zahra <dizalysha@gmail.com>
 *
 */
<<<<<<< HEAD
import java.util.Scanner;
public class MatricesPad {


    public static void main(String[] args) {
        Scanner Diza = new Scanner(System.in);
        int start,end,size,awal;
        start = Diza.nextInt();
        end = Diza.nextInt();
        size = Diza.nextInt();
        awal = start;
        if (end >= start) {
            while(end >= start) {
                for(int i=0; i < size; i++) {
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
            while(start >= end) {
                for(int i=0; i < size; i++) {
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
=======

public class MatricesPad {

    public static void main(String[] args) {
        Scanner Dz = new Scanner(System.in);

        int start = Dz.nextInt();
        int end = Dz.nextInt();
        int size = Dz.nextInt();

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

        Dz.close();
>>>>>>> 638cbda (feat(loop/Eyes):add code)
    }
}