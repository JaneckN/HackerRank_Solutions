package thirty_days_of_code.Day5_Loops;

import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" x "+n+" = "+i*n);

        }
        scanner.close();
    }
}
