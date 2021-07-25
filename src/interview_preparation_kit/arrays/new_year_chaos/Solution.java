package interview_preparation_kit.arrays.new_year_chaos;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 13 March 2021 @ 18:56
 */


import java.util.Scanner;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int bribeCounter = 0;
        int elementToSwap;
        boolean chaotic = false;
        boolean isChange = true;


        //bubble sorting
        while (isChange) {
            isChange = false;

            // checking is there more than 2 bribes
            for (int i = 0; i < q.length; i++) {
                if (Math.abs(q[i] - (i + 1)) > 2) {
                    chaotic = true;
                    break;
                }
                if (q[i] > q[i + 1]) {
                    elementToSwap = q[i];
                    q[i] = q[i + 1];
                    q[i + 1] = elementToSwap;
                    bribeCounter++;
                    isChange = true;
                }
            }
        }

        // printing results
        if (chaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(bribeCounter);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
