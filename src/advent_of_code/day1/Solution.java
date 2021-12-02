package advent_of_code.day1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 02 December 2021 @ 18:30
 */


public class Solution {


    public static void main(String[] args) throws IOException {


        System.out.println("Type any number of integers and enter any string to calculate");

        List<Integer> input = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()){
            input.add(scanner.nextInt());
        }

        System.out.println(getNumberOfIncreases(input));

    }

    private static int getNumberOfIncreases(List<Integer> input) {

        int counter = 0;
        int[] inputArray = input.stream().mapToInt(n -> n).toArray();
        for (int i = 1; i < inputArray.length ; i++) {
            if(inputArray[i-1]<inputArray[i]){
                counter++;
            }
        }
        return counter;
    }


}
