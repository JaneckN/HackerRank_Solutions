package interview_preparation_kit.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 25 July 2021 @ 17:52
 */


class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
        int swapCount = 0;
        Integer[] array = new Integer[a.size()];
        a.toArray(array);
        boolean isSwap = true;
        while (isSwap) {
            isSwap = false;
            for (int i = 0; i < a.size() - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSwap = true;
                    swapCount++;
                }

            }
        }
        System.out.println("Array is sorted in "+swapCount+" swaps.");
        System.out.println("First Element: "+array[0]);
        System.out.println("Last Element: "+array[array.length -1]);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.countSwaps(a);

        bufferedReader.close();
    }
}
