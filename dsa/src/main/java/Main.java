import stacks.BalancedExpression;
import stacks.StackImpl;
import stacks.StringReversal;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(20);
        stack.pop();
        System.out.println(Arrays.toString(stack.getStack()));
        System.out.println(stack.peek());
    }

}
