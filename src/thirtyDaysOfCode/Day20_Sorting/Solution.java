package thirtyDaysOfCode.Day20_Sorting;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }


        int swapTotal = 0;
        boolean wasSwap = true;

        while (wasSwap == true){
        wasSwap=false;
        for (int i = 0; i < a.length-1 ; i++) {
            if (a[i] > a[i+1]) {
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                swapTotal += 1;
                wasSwap = true;
            }
        }
        }

            System.out.println("Array is sorted in "+swapTotal+" swaps");
            System.out.println("First Element: "+a[0]);
            System.out.println("Last Element: "+a[a.length -1]);

    }
}