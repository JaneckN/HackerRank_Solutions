package thirtyDaysOfCode.Day26_Nested_Logic;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] returned = new int[3];
        int[] expected = new int[3];
        for (int i = 0; i < 3; i++) {
            returned[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            expected[i] = sc.nextInt();
        }

        if(returned[2]!=expected[2]){
            if(returned[2]<expected[2]){
                System.out.println(0);
            } else {
                System.out.println(1000);
            }
        } else if(returned[1]!=expected[1]){
            if(returned[1]<expected[1]){
                System.out.println(0);
            }else {
                int delayed = returned[1] - expected[1];
                System.out.println(delayed * 500);
            }
        } else if (returned[0]!=expected[0]){
            if(returned[0]<expected[0]){
                System.out.println(0);
            }else {
                int delayed = returned[0] - expected[0];
                System.out.println(delayed * 15);
            }
        } else {
            System.out.println(0);
        }

    }
}