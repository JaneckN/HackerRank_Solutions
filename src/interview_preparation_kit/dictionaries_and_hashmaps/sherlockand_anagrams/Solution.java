package interview_preparation_kit.dictionaries_and_hashmaps.sherlockand_anagrams;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 31 March 2021 @ 21:55
 */

import java.io.IOException;
import java.util.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int anagramCounter = 0;
        List<String> subStrings = new ArrayList<>();

        //divide input String s to substrings.
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                subStrings.add(sub);
            }
        }

        // counting anagrams
        for (int i = 0; i < subStrings.size() - 1; i++) {
            for (int j = i + 1; j < subStrings.size(); j++) {
                if (subStrings.get(i).length() == subStrings.get(j).length()) {
                    if (isAnagram(subStrings.get(i), subStrings.get(j))) {
                        anagramCounter++;
                    }
                }
            }

        }
        return anagramCounter;
    }

    private static boolean isAnagram(String a, String b) { //ab bb
        Map<Character, Integer> anagramMap = new HashMap<>();
        boolean isAnagram = false;

        for (int j = 0; j < a.length(); j++) {
            Integer counter = anagramMap.get(a.charAt(j));
            if (counter == null) {
                anagramMap.put(a.charAt(j), 1);
            } else {
                anagramMap.put(a.charAt(j), ++counter);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            Integer counter = anagramMap.get(b.charAt(i));
            if (counter == null || counter <= 0) {
                isAnagram = false;
                break;
            } else {
                anagramMap.put(b.charAt(i), --counter);
                isAnagram = true;
            }
        }

        return isAnagram;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);
            System.out.println(result);

        }


        scanner.close();
    }
}
