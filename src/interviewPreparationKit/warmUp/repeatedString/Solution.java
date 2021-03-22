package interviewPreparationKit.warmUp.repeatedString;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 11 March 2021 @ 22:19
 */


import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long aCounter = 0;
        long result =0;
        int aInInputString = 0;
        StringBuilder string = new StringBuilder(s);


        // check how many a's is in the input string s .
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 97) {
                aInInputString++;
            }
        }


        // if string contain only a's , return n?
        if (aInInputString == s.length()) {
            return n;
        }


        // input string longer than n parameter.
        if (s.length() >= n) {
            for (int i = 0; i < n ; i++) {
                if (s.charAt(i) == 97) {
                    aCounter++;
                }
            }

            //string shorter than n parameter - string append .

        } else {
            long stringRepeats = n / s.length();
            long reszta = n%s.length();
            aCounter = aInInputString * stringRepeats;

            for (int i = 0; i < reszta; i++) {
                if (string.charAt(i) == 97) {
                    aCounter++;
                }

            }

        }
        return   aCounter;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();


        System.out.println(result);
        scanner.close();
    }
}
