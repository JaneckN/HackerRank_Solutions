package thirtyDaysOfCode.Day7_Arrays;

import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?").nextLine());
        int[] arr = new int[n];

        String[] arrItems = scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?").nextLine().split(" ");


        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[n-i-1]);
        }

        for (int x: arr) {
            System.out.print(x+" ");

        }

        scanner.close();
    }
}
