package interview_preparation_kit.recruitment_tasks;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 10 October 2021 @ 20:23
 */


import java.util.Arrays;
import java.util.List;

public class MaxSum {
//    public static int findMaxSum(List<Integer> list) {
//        Collections.sort(list);
//        return list.get(list.size()-1)+ list.get(list.size()-2);
//    }


    public static int findMaxSum(List<Integer> list) {
        int max1 = list
                .stream()
                .mapToInt(v -> v)
                .max().getAsInt();
        list.set(list.indexOf(max1), 0);
        int max2 = list
                .stream()
                .mapToInt(v -> v)
                .max().getAsInt();

        return max1+max2;
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list));
    }
}