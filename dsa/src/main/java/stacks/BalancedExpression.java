package stacks;

import java.util.Stack;

public class BalancedExpression {
    public boolean isExpressionBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(' || c == '{' || c == '[' || c == '<') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']' || c == '>') {
                if (stack.empty()) {
                    return false;
                } else {
                    var popped = stack.pop();
                    if (matches(popped, c)) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }

    private boolean matches(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']') ||
                (opening == '<' && closing == '>');
    }
}
