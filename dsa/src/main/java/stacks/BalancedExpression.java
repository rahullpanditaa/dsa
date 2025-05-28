package stacks;

import java.util.Stack;

public class BalancedExpression {
    public boolean isExpressionBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.empty()) { return false; }
                stack.pop();
            }
        }
        return stack.empty();
    }
}
