package interview_preparation_kit.additional;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 21 July 2021 @ 20:36
 */


public class Solution {

    public static void fizzBuzz() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 00) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 && i % 5 != 00) {
                System.out.println("Fizz");
            } else if (i % 3 != 0 && i % 5 == 00) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialRecursion(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }


    public static void main(String[] args) {
        fizzBuzz();
        System.out.println(factorial(5));
        System.out.println(factorialRecursion(0));
    }


}
