package stacks;

import java.util.Stack;

public class StringReversal {

    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input is null");
        }
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.substring(i,i+1));
        }
        var reversed = new StringBuilder();
        while (!(stack.empty())) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
