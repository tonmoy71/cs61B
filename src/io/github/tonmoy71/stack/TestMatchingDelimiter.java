package io.github.tonmoy71.stack;

/**
 * Created by Fahim on 3/1/2017.
 */
public class TestMatchingDelimiter {

    public static final String opening = "({[";
    public static final String closing = ")}]";

    private static boolean isMatched(String expression) {
        Stack<Character> buffer = new LinkedStack<>();

        for (char c : expression.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                buffer.push(c);
            } else if (closing.indexOf(c) != -1) {
                if (buffer.isEmpty()) {
                    return false;
                }
                if (closing.indexOf(c) != opening.indexOf(buffer.pop())) {
                    return false;
                }
            }
        }

        return buffer.isEmpty();
    }

    public static void main(String[] args) {

        String expression1 = "()(()){([()])}";
        String expression2 = ")(()){([()])}";
        String expression3 = "((()(()){([()])}))";

        System.out.println("Is matched " + expression1 + ": " + isMatched(expression1));
        System.out.println("Is matched " + expression2 + ": " + isMatched(expression2));
        System.out.println("Is matched " + expression3 + ": " + isMatched(expression3));

    }

}
