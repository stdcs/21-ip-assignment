package ip.syssrc.function;

/**
 * Vigesimal
 *
 * Assignment 4.1
 *
<<<<<<< HEAD
<<<<<<< HEAD
 * @author H071211051 - Febi Fiantika <febifian23@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 773b808 (feat(function): add assignment 4 placeholder files)
=======
 * @author H071211051 - Febi Fiantika <febifian23@gmail.com>
>>>>>>> e41ab3f (feat(function/Vigesimal): add code)
 */
public class Vigesimal {

    /**
     * Convert a radix-10 (decimal) number into radix-20 (vigesimal) number
     *
     * @param n the radix-10 number to be converted
     * @return array of char that represent the radix-20 format
     */
    public static char[] toVigesimal(int n) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e41ab3f (feat(function/Vigesimal): add code)
        int length = (n >= 20) ? 2 : 1;
        char[] arr = new char[length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int modulo = (n % 20);
            arr[i] = (modulo > 9) ? (char) (modulo + 55) : (char) (modulo + '0');
            n /= 20;
        }
<<<<<<< HEAD
=======
>>>>>>> 773b808 (feat(function): add assignment 4 placeholder files)
=======
>>>>>>> e41ab3f (feat(function/Vigesimal): add code)
        return new char[] {};
    }

    /**
     * Print the vigesimal multiplication table
     *
     * @return void
     */
    public static void table() {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e41ab3f (feat(function/Vigesimal): add code)
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                char[] vigecimal = toVigecimal(i*j);
                String vig = "";
                for(char k:vigecimal) {
                    vig += k;
                }
                System.out.printf("%3s",vig);
            }
            System.out.println("");
        }
<<<<<<< HEAD
=======
>>>>>>> 773b808 (feat(function): add assignment 4 placeholder files)
=======
>>>>>>> e41ab3f (feat(function/Vigesimal): add code)
    }
}
