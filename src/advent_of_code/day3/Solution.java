package advent_of_code.day3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 03 December 2021 @ 19:35
 */


public class Solution {

    public static void main(String[] args) throws IOException {


        System.out.println("Type any number of integers and enter any string to calculate");

        List<String> input = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.equals("e")){
                break;
            }
            input.add(line);
        }

        int[][] table = new int[input.size()][12];

        for (int i = 0; i < input.size(); i++) {
            String line = input.get(i);
            for (int j = 0; j < 12; j++) {
               table[i][j]=Integer.parseInt(String.valueOf(line.charAt(j)));
            }
        }

        StringBuilder gamma = new StringBuilder("");
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < table.length; j++) {
                sum += table[j][i];
            }

            if(sum>= table.length/2){
                gamma.append(1);

            }else{
                gamma.append(0);
            }

        sum = 0;
        }

        System.out.println(gamma);


        StringBuilder epsilon = binarySwap(gamma);

        System.out.println(epsilon);

        int intGamma = Integer.parseInt(gamma.toString(),2);
        int intepsilon =  Integer.parseInt(epsilon.toString(),2);
        System.out.println(intepsilon*intGamma);
    }

    private static StringBuilder binarySwap(StringBuilder gamma) {
        StringBuilder epsilon = new StringBuilder("");
        for (int i = 0; i < gamma.length(); i++) {
            if(gamma.charAt(i)==49){
                epsilon.append(0);
            } else{
                epsilon.append(1);
            }

        }
        return  epsilon;
    }




}

















