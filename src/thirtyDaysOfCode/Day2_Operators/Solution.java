package thirtyDaysOfCode.Day2_Operators;

import java.util.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = 0;
        if (tip_percent != 0){
            tip = (meal_cost * tip_percent)/100;
        }

        double tax = 0;
        if (tax_percent != 0){
            tax = (meal_cost * tax_percent)/100;
        }

        double total = meal_cost + tip + tax;
        System.out.println(Math.round(total));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
