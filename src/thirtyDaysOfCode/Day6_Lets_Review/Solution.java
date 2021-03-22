package thirtyDaysOfCode.Day6_Lets_Review;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numberOfCases=Integer.parseInt(sc.nextLine());
        List<String> inputs = new ArrayList<>();
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();



        for (int i = 0; i < numberOfCases; i++) {
            inputs.add(sc.nextLine());
        }
        sc.close();

        for (int i = 0; i < inputs.size(); i++) {
            char[] inputCharArray = inputs.get(i).toCharArray();
            for (int j= 0; j < inputCharArray.length ; j++) {
                if (j%2!=0){
                    even.append(inputCharArray[j]);
                } else {
                    odd.append(inputCharArray[j]);
                }
            }
            System.out.println(odd+" "+even);
           even.delete(0,even.length());
           odd.delete(0,odd.length());

        }
       
    }
}

