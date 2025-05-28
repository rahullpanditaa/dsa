package stacks;

public class StackImpl {
    private int[] stack = new int[5];
    private int count = 0;

    private int stackSize() { return stack.length; }

    public void push(int item) {
        var stackSize = stackSize();
        if (count >= stackSize) {
            var newStack = new int[stackSize + (stackSize/2)];
            for (int i = 0; i < stackSize; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
            stack[count] = item;
            count++;

        } else {
            stack[count] = item;
            count++;

        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        var poppedItem = stack[count];
        count--;
        return poppedItem;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        return stack[count-1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int[] getStack() {
        var stackToReturn = new int[count];
        for (int i = 0; i < stackToReturn.length; i++) {
            stackToReturn[i] = stack[i];
        }
        return stackToReturn;
    }

}
