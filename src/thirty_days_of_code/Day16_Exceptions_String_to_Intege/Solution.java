package thirty_days_of_code.Day16_Exceptions_String_to_Intege;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            System.out.println(Integer.parseInt(S));
        } catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}