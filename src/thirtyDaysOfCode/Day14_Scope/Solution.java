package thirtyDaysOfCode.Day14_Scope;

import java.util.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;

    }


    public void computeDifference() {
        int result = 0;
        int max = 0;
        for (int j = 0; j < elements.length-1 ; j++) {
            for (int i = 0; i < elements.length - 1; i++) {
                result = Math.abs(elements[j]) - Math.abs(elements[i + 1]);
                result = Math.abs(result);
                max = Math.max(max, result);
            }
        }
        maximumDifference = max;
    }

}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}