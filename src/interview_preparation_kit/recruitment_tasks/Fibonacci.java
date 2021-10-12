package interview_preparation_kit.recruitment_tasks;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 18 July 2021 @ 17:28
 */


public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 1 || n < 0) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }


    public static int fibonacciSequenceValue(int n) {
        if (n == 1 || n < 0) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        int[] fibonacciSequence = new int[n];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;
        int vale = 0;
        int temp = 0;
        for (int i = 2; i < n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
        return fibonacciSequence[n-1];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(40));
       System.out.println(fibonacciSequenceValue(40));
       float a = 1l;
       long b= 3L;
        System.out.println(a/b);

    }
}
