package thirtyDaysOfCode.Day28_RegEx_Patterns_and_Intro_to_Databases;


import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        List<String> usersNames = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            if(emailID.contains("@gmail.com")){
                usersNames.add(firstName);
            }

        }

        scanner.close();

        Collections.sort(usersNames);
        for (String x: usersNames) {
            System.out.println(x);

        }

     }
}
