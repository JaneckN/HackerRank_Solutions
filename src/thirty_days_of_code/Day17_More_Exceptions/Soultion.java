package thirty_days_of_code.Day17_More_Exceptions;

import java.util.*;

class  Calculator{
    int power(int n,int p){
        if (n < 0 || p < 0){
            throw  new IllegalArgumentException("n and p should be non-negative");
        }
        return (int) Math.pow(n,p);
    }
}

class Solution{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}