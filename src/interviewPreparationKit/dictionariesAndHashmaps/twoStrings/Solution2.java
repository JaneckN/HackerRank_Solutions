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

public class Solution2 {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        Map<Character, Integer> s1Map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            Integer counter = s1Map.get(s1.charAt(i));
            if(counter == null){
                s1Map.put(s1.charAt(i), 1);
            } else {
                s1Map.put(s1.charAt(i), ++counter);
            }
        }


        for (int i = 0; i < s2.length(); i++) {
            if(s1Map.containsKey(s2.charAt(i))) {
                return "YES";
            }
        }
        return "NO";
    }




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
