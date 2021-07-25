package interview_preparation_kit.dictionaries_and_hashmaps.hash_tables_ransom_note;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 21 March 2021 @ 17:14
 */


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        boolean isContain = false;

        List<String> magazineCopy = Arrays.stream(magazine).collect(Collectors.toList());


        for (String n : note) {
            if (!magazineCopy.contains(n) ||(note.length > magazine.length) ) {
                isContain = false;
                break;
            } else {
                isContain = true;
                magazineCopy.remove(n);
            }
        }

        if (isContain) {
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
