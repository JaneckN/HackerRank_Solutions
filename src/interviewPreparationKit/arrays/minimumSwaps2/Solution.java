package interviewPreparationKit.arrays.minimumSwaps2;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 13 March 2021 @ 17:18
 */


import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int swapCounter = 0;
        int elementToSwap;
        for (int i = 0; i < arr.length; i++) {

            //trough while loop we swap values(index number with value on this index) as long as first index in arr  will be 1.
            while (arr[i] != i + 1) {
                elementToSwap = arr[i];
                arr[i] = arr[elementToSwap - 1];
                arr[elementToSwap - 1] = elementToSwap;
                swapCounter++;
            }
        }
        return swapCounter;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        System.out.println(res);


        scanner.close();
    }
}
