package interview_preparation_kit.string_manipulation.making_anagrams;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 15 August 2021 @ 22:51
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {

        StringBuilder strA = new StringBuilder(a);
        StringBuilder strB = new StringBuilder(b);
        int counter = 0;
        int reps = 0;

        for (int i = 0; i < a.length(); i++) {
            if (strB.indexOf(String.valueOf(strA.charAt(i))) >= 0) {
                strB.deleteCharAt(strB.indexOf(String.valueOf(strA.charAt(i))));
                reps++;
            }

            if(strB.length()==0){
                break;
            }

        }
        counter = a.length()+b.length() - (2*reps);


        return counter;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);
        System.out.println(res);

        bufferedReader.close();
    }
}
