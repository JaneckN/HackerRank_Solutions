package interview_preparation_kit.additional;

import java.util.Arrays;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 20 August 2021 @ 18:26
 *

This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].


 */


class CodilityDemo {
    public int solution(int[] A) {

        //efficient solution :

        Arrays.sort(A);
        int smallest = 1;

        if(A.length == 0){
            return smallest;
        }

        if(A[0] > 1) {
            return smallest;
        }

        if(A[A.length-1] <= 0) {
            return smallest;
        }

        for (int i = 0; i < A.length; i++) {
        if(A[i]==smallest){
            smallest++;
        }
        }
        return  smallest;



//        SortedSet setOfInt = new TreeSet<Integer>();
//        int result = 0;
//        for (int a:A) {
//            if (a>0){
//                setOfInt.add(a);
//            }
//
//        }
//        for (int i = 1; i < setOfInt.size() + 1; i++) {
//            if (!setOfInt.contains(i)) {
//                result = i;
//                break;
//            }
//        }
//
//        int result2 = result == 0 ? setOfInt.size() + 1 : result;
//        return result2;

    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 4, 1, 2, 8, 10};
        CodilityDemo codilityDemo = new CodilityDemo();
        System.out.println(codilityDemo.solution(arr));


    }
}

