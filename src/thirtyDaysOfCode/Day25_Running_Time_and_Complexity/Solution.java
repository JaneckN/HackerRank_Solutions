package thirtyDaysOfCode.Day25_Running_Time_and_Complexity;

import java.util.*;

public class Solution {

    public static boolean isPrime(long number) {
        if (number == 2) {
            System.out.println("Prime");
            return true;
        }
        if(number == 1 ||number % 2 == 0){
            System.out.println("Not prime");
            return false;
        }
        if (number >= 3) {
            for (int i = 3; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Not prime");
                    return false;
                }
            }

        }
        System.out.println("Prime");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        long[] isPrimeArray = new long[t];
        for (int i = 0; i < t; i++) {
            isPrimeArray[i] = sc.nextLong();
        }

        for (long x: isPrimeArray) {
            isPrime(x);
        }


    }
}



