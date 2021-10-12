package interview_preparation_kit.recruitment_tasks;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 07 October 2021 @ 23:37
 */


public class UserInput {

    private static String value ="";


    public static class TextInput {
        public void add(char c) {
            value += c;

        }

        public String getValue() {
            return value;
        }
    }

    public static class NumericInput  extends  TextInput{
        @Override
        public void add(char c) {
            if(Character.isDigit(c)){
                value += c;
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}