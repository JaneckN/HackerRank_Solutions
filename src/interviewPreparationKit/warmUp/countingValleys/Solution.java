package interviewPreparationKit.warmUp.countingValleys;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 10 March 2021 @ 21:53
 */

import java.io.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int high = 0; //  high on currently  step
        int highBackward = 0; // high on last step.
        int valleysCounter = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 85) {
                highBackward = high;
                high += 10;
            } else {
                highBackward = high;
                high -= 10;

            }
            if (high >= 0 && highBackward < 0) {
                valleysCounter++;
            }

        }
        return valleysCounter;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
