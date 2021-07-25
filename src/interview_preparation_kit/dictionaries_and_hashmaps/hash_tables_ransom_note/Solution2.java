package interview_preparation_kit.dictionaries_and_hashmaps.hash_tables_ransom_note;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 21 March 2021 @ 17:14
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution2 {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        Map<String, Integer> magazineMap = new HashMap<String, Integer>();
        boolean isContain = true;

        //fill up magazineMap where key is our string from magazine Array, and value is a int , value is increment +1 if key is repeated.
        for (int i = 0; i < magazine.length; i++) {
            Integer counter = magazineMap.get(magazine[i]);
            if (counter == null) {
                magazineMap.put(magazine[i], 1);
            } else {
                magazineMap.put(magazine[i], ++counter);
            }
        }

        // updated MagazineMap with input note Array, if String from note is in MagazineMap, we overwrite value (decrement-1).
        // If magazineMap doesn't cover all repeated String from note[] isContain is set to false .
        for (int j = 0; j < note.length; j++) {
            Integer counter = magazineMap.get(note[j]);
            if (counter == null || counter == 0) {
                isContain = false;
                break;
            } else {
                magazineMap.put(note[j], --counter);
            }
        }

        if (isContain == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
