package interview_preparation_kit.arrays.left_rotation;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 13 March 2021 @ 14:27
 */


import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int[] result = new int[a.length];


        int index = 0;
        for (int i = d; i < a.length ; i++) {
            result[index] = a[i];
            index++;
        }

        for (int i = 0; i < d; i++) {
            result[index] = a[i];
            index++;
            
        }


        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int res: result) {
            System.out.println(res);

        }

        scanner.close();
    }
}
