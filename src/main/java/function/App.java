/*
 * Lecture 4: Function
 */
package function;

public class App {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRec(5));
        System.out.println(factorialTailRec(5, 1));
    }

    // NOTE: void function a.k.a. procedure
    static void print() {
        System.out.println("Hello World");
        System.out.println("From Function");
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    // f(x) = 2x + 1
    // f(3) = 2(3) + 2
    static void add(int a, int b, char c) {
        System.out.printf("%d + %d = %d\n", a, b, (a + b));
    }

    // Overloading
    static void add(String firstName, String lastName) {
        System.out.printf("%s %s.\n", firstName, lastName);
    }

    // NOTE: non-void function
    static int sum(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }

    static int sum(int[] nums) {
        int result = 0;
        for (int index = 0; index < nums.length; index++) {
            result += nums[index];
        }
        return result;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    // NOTE: recursive
    // fact(5) -> fact(4) -> fact(3) -> fact(2) -> fact(1) -> fact(0)
    static int factorialRec(int n) {
        return n == 0 ? 1 : n * factorialRec(n - 1);
    }

    // NOTE: tail-recursive
    static int factorialTailRec(int n, int result) {
        return n == 0 ? result : factorialTailRec(n - 1, result * n);
    }
}
