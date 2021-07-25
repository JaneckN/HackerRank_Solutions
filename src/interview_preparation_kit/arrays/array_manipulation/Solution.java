package interview_preparation_kit.arrays.array_manipulation;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 14 March 2021 @ 01:23
 */


import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int [][] queries) {

        long [] result = new long [n+2];
        int leftIndex;
        int rightIndex;
        int sum;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < queries.length; i++) {
            leftIndex = queries[i][0];
            rightIndex = queries[i][1];
            sum = queries[i][2];

            result[leftIndex] += sum;
            result[rightIndex+1] -= sum;

        }

        long temp = 0;
        for (int i = 0; i < result.length; i++) {
            temp  += result[i];
            max = Math.max(max, temp);
        }

        return max;
    }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main (String[]args) throws IOException {

            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int [][] queries = new int [m][3];

            for (int i = 0; i < m; i++) {
                String[] queriesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 3; j++) {
                    int queriesItem = Integer.parseInt(queriesRowItems[j]);
                    queries[i][j] = queriesItem;
                }
            }

            long  result = arrayManipulation(n, queries);


            scanner.close();
        }
    }
