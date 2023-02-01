package com.cydeo.interviewPrep.leetCodeReview;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "([}}])";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        if (str.isEmpty() || str.isBlank()) return false;
        if (str.length() % 2 == 1) return false;

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < str.length() - 1; i++) {

            if (stack.isEmpty() && (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}')) continue;

            else if (str.charAt(i) == '(' || str.charAt(i) == '{'
                    || str.charAt(i) == '[') stack.push(str.charAt(i));

            else if ((stack.peek() == '(' && str.charAt(i) == ')')
                    || (stack.peek() == '{' && str.charAt(i) == '}')
                    || (stack.peek() == '[' && str.charAt(i) == ']'))
                stack.pop();
            else stack.push(str.charAt(i));
            System.out.println(stack);

        }
        if (stack.size() > 1) return false;
        if (stack.isEmpty()) return false;

        if (stack.size() == 1 && ((stack.peek() == '(' && str.charAt(str.length() - 1) == ')') || (stack.peek() == '{' && str.charAt(str.length() - 1) == '}') ||
                (stack.peek() == '[' && str.charAt(str.length() - 1) == ']'))) stack.pop();

        return stack.isEmpty();
    }
}
