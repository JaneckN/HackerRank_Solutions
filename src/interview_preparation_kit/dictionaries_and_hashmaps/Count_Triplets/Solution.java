package interview_preparation_kit.dictionaries_and_hashmaps.Count_Triplets;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 03 May 2021 @ 23:24
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    //Partial solution - For Any

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {

        long tripletsCounter = 0L;
        TreeMap<Long, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.size(); i++) {
            Integer value = treeMap.get(arr.get(i));
            if (value == null) {
                treeMap.put(arr.get(i), 1);
            } else {
                treeMap.put(arr.get(i), ++value);
            }
        }


        long triplets = 0;
        Set<Long> keys = treeMap.keySet();
        long left = 0l;
        long middle = 0l;
        long right = 0l;
        for (Long item : keys) {
            ;
            middle = item;
            left = (middle % r == 0) ? middle / r : 0;
            right = middle * r;

            if (treeMap.containsKey(left) && treeMap.containsKey(right)) {
                triplets += treeMap.get(left) * treeMap.get(middle) * treeMap.get(right);
            }

        }
        return triplets;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long ans = countTriplets(arr, r);
        System.out.println(ans);


        bufferedReader.close();
    }
}
