package interviewPreparationKit.dictionariesAndHashmaps.twoStrings;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 22 March 2021 @ 20:45
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        boolean contain = false;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.contains(String.valueOf(s2.charAt(i)))) {
                contain = true;
            }
        }

        if (contain) {
            return "YES";
        } else {
            return "NO";

        }
    }

    Map<String, Integer> magazineMap = new HashMap<String, Integer>();



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
