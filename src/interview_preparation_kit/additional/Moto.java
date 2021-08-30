package interview_preparation_kit.additional;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 22 August 2021 @ 20:23
 */


class Moto {
    public static int solution(int N) {

        int inputSum = getSumOfDigits(N);
        int outputSum = inputSum * 2;

        int by9 = outputSum / 9;
        int by9mod = outputSum % 9;

        StringBuilder outputNumber = new StringBuilder("");

        if (outputSum <= 9) {
            outputNumber.append(1);
            outputNumber.append(outputSum-1);
            return Integer.parseInt(outputNumber.toString());

        }

        if (by9mod != 0) {
            outputNumber.append(String.valueOf(by9mod));
        }

        if (by9 != 0) {
                for (int i = 0; i < by9; i++) {
                    outputNumber.append("9");
                }
            }



        return Integer.parseInt(outputNumber.toString());
    }


    private static int getSumOfDigits(int N) {
        int sumOfN = 0;
        String number = String.valueOf(N);
        char[] digits1 = number.toCharArray();
        for (char dig : digits1) {
            sumOfN += Character.getNumericValue(dig);
        }

        return sumOfN;
    }

    public static void main(String[] args) {
        System.out.println(solution(499));
    }
}
