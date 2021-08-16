package interview_preparation_kit.sorting.fraudulent_activity_notifications;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 28 July 2021 @ 19:41
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */


    //Partial solution (not for every cases - time limit on hacker rank)

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int numberOfNotices = 0;
        double median = 0;
        List<Integer> subList = new ArrayList<>();


        for (int i = 0; i < expenditure.size() - d; i++) {
            median = 0;
            subList.clear();
            for (int j = i; j < i + d; j++) {
                subList.add(expenditure.get(j));
            }
            median = getMedian(subList, d);
            if (2 * median <= expenditure.get(i + d)) {
                numberOfNotices++;
            }
        }
        return numberOfNotices;
    }

    private static double getMedian(List<Integer> subList, int d) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Integer value = 0;
        for (Integer v : subList) {
            value = treeMap.get(v);
            if (value == null) {
                treeMap.put(v, 1);
            } else {
                treeMap.put(v, ++value);
            }
        }

        int[] counter = new int[d];
        Set<Integer> treeSet = treeMap.keySet();
        int index = 0;
        for (Integer v : treeSet) {
            int rep = treeMap.get(v);
            while (rep != 0) {
                counter[index] = v;
                treeMap.put(v, --rep);
                index++;

            }
        }

        return d % 2 != 0 ? counter[d / 2] : (counter[d / 2] + counter[(d / 2) + 1]) / 2.0;


    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> expenditure = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.activityNotifications(expenditure, d);

        System.out.println(result);

        bufferedReader.close();

    }
}
