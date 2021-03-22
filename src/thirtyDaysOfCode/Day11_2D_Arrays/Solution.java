package thirtyDaysOfCode.Day11_2D_Arrays;

import java.util.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static int sum(int[][] arr, int x, int y) {
        int count = 0;
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (i == x+1 && j == y+1) {
                    count += arr[x+1][y+1];
                } else if(i == x+1 && j == y) {
                } else if(i == x+1 && j == y+2){
                } else {
                    count += arr[i][j];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();

        int count = 0; // count
        int result = Integer.MIN_VALUE; // max
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                count = sum(arr, i, j);
                result = Math.max(result, count);
            }
        }

        System.out.println(result);

    }

}

