package christober.learning.collection.stackpgms;

import java.util.Stack;

public class Pgm2 {
    static void main() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);

        System.out.println("Original Stack: " + stack);
        // Remove duplicates using a temporary buffer (aux stack)
        Stack<Integer> newStack = new Stack<>();
        while (!stack.isEmpty()) {
            Integer value = stack.pop();
            if (!newStack.contains(value)) {
                newStack.push(value);
            }
        }
        System.out.println(stack.capacity());

    }
}
