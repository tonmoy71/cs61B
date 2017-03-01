package io.github.tonmoy71.hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/balanced-brackets
 */
public class BalancedBracket {
    private static String opening = "({[";
    private static String closing = ")}]";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfInput = in.nextInt();
        for (int count = 0; count < numberOfInput; count++) {
            String str = in.next();
            if (isMatched(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isMatched(String expression) {
        Stack<Character> buffer = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (opening.indexOf(ch) != -1) {
                buffer.push(ch);
            } else if (closing.indexOf(ch) != -1) {
                if (buffer.isEmpty()) {
                    return false;
                }
                if (closing.indexOf(ch) != opening.indexOf(buffer.pop())) {
                    return false;
                }
            }
        }

        return buffer.isEmpty();
    }
}
