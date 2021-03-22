package thirtyDaysOfCode.Day10_Binary_Numbers;

import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        int counter = 0;
//        StringBuilder string = new StringBuilder();
//        if (n >= 8) {
//            counter++;
//            n -= 8;
//            string.append("1");
//        } else {
//            string.append("0");
//        }
//        if (n >= 4) {
//            counter++;
//            n -= 4;
//            string.append("1");
//        } else {
//            string.append("0");
//
//        }
//        if (n >= 2) {
//            counter++;
//            n -= 2;
//            string.append("1");
//        } else {
//            string.append("0");
//        }
//        if (n == 1) {
//            counter++;
//            n -= 1;
//            string.append("1");
//        } else {
//            string.append("0");
//        }

        String binary;
        binary = Integer.toBinaryString(n);

        int count = 0; // count
        int result = 0; // max

        for (int i = 0; i < binary.length(); i++) {

            // Reset count when 0 is found
            if (binary.charAt(i) == '0') {
                count = 0;
            } else {
                count++;//increase count
                result = Math.max(result, count);
            }
        }


        System.out.println("liczba n:" + n + ", liczba kolejnych jedynek:" + result);
        System.out.println(binary);
        scanner.close();

    }
}

