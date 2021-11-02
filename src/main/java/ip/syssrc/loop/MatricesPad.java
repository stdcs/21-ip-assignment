package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211065 - Asehpryanto Rari Parinding <asehpryantorari@gmail.com>
 *
 */
import java.util.Scanner;
public class MatricesPad {

    public static void main(String[] args) {
        Scanner bk = new Scanner(System.in);
        
        int start,end,size,awal;
        start = bk.nextInt();
        end = bk.nextInt();
        size = bk.nextInt();
        awal = start;
        bk.close();
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
    }
}