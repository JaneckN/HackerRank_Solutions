package interviewPreparationKit.warmUp.jumpingOnTheClouds;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 11 March 2021 @ 20:57
 */

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int jumps = c.length - 1;
        int thunderheadCloudsQuantity = (int) Arrays.stream(c).filter(cloud -> cloud == 1).count();
        int totalJumps = jumps - thunderheadCloudsQuantity;

        int one;
        int two;
        int three;

        //check for shorter way
        for (int i = 1; i < c.length - 1; i++) {
            one = c[i-1];
            two = c[i];
            three = c[i + 1];
            if (one == two && one == three) {
                totalJumps--;
            }


        }
        return totalJumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
