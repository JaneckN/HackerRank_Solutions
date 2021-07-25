package interview_preparation_kit.arrays.two_dim_array;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 12 March 2021 @ 20:03
 */


import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int hourglassSum = 0;
        int hourglassMax= Integer.MIN_VALUE;


        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4 ; c++) {

        // single hourglass sum counter;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c+3 ; j++) {
                if(i==r+1 && (j==c || j==c+2)){
                    continue;
                }
                hourglassSum += arr[i][j];
            }
        }


        if (hourglassSum > hourglassMax){
            hourglassMax = hourglassSum;

        }
        hourglassSum = 0;

            }
        }
        return hourglassMax;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);



        scanner.close();
    }
}

