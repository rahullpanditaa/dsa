package stacks;

import java.util.Stack;

public class BalancedExpression {
    public boolean isExpressionBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty()) { return false; }
                if (c == stack.pop()) { return true; }
            }
        }
        return stack.empty();
    }
}
