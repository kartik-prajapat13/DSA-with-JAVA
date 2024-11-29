import java.util.*;

public class stringparanthesis {

    public static void main(String[] args) {
        // Solution solution=new Solution();

        String input1 = "()()";

        System.out.println(paranthesis(input1));

    }

    static String paranthesis(String s) {

        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {

                if (balance > 0) {
                    result.append(c);

                }

                balance++;

            } else if (c == ')') {

                balance--;

                if (balance > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();

    }
}