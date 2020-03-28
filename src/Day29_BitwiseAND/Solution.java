package Day29_BitwiseAND;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static int findMax(int n, int k){
        int max = 0;
        int current=0;

        for (int i = 1; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                current = i&j;
                if((current > max) && (current < k)){
                    max = current;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> numbers = new ArrayList<>();



        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            numbers.add(findMax(n,k));

        }
        scanner.close();

        for (Integer x:numbers) {
            System.out.println(x);

        }

    }
}
