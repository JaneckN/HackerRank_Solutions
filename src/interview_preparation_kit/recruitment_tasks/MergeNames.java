package interview_preparation_kit.recruitment_tasks;

import java.util.TreeSet;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 07 October 2021 @ 23:21
 */


public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        TreeSet<String> set = new TreeSet<String>();
        for (String n1 : names1) {
            set.add(n1);
        }
        for (String n2 : names2) {
            set.add(n2);
        }
        String[] output = new String[set.size()];
        int iterator = 0;
        for (String s:set) {
            output[iterator]=s;
            iterator++;
        }
return output;
        }




    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}