package advent_of_code.day2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 02 December 2021 @ 20:04
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




        Map<String, Integer> moves  = new HashMap<String, Integer>();
        moves.put("up",0);
        moves.put("down",0);
        moves.put("forward",0);

        for (String s:input) {
            String[] part = s.split("(?<=\\D)(?=\\d)");
            Integer counter = moves.get(part[0].trim());
            int actual = Integer.parseInt(part[1]);
            moves.put(part[0].trim(), counter+actual);
            }
        int depth = moves.get("down")-moves.get("up");
        int hori = moves.get("forward");

        System.out.println(depth*hori);


        }





    }
