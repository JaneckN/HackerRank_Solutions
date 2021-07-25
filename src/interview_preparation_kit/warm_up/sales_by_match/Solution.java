package interview_preparation_kit.warm_up.sales_by_match;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 09 March 2021 @ 19:33
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int TotalPairOfSocks = 0;
        int pairOfSocks = 0;
        long socksNumber = 0;


        if (ar.length == 0) {
            return 0;
        }

        Set<Integer> Unique = Arrays.stream(ar).boxed().collect(Collectors.toSet());

        for (int sock : Unique) {
            socksNumber = Arrays.stream(ar).filter(i -> i == sock).count();
            pairOfSocks = (int) socksNumber / 2;
            TotalPairOfSocks += pairOfSocks;
            pairOfSocks = 0;
        }


        return TotalPairOfSocks;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);


        System.out.println(result);

        scanner.close();
    }
}
