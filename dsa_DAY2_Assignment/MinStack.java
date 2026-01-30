package dsa_DAY2_Assignment;

import java.util.Stack;

class MinStackMethods {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }

        System.out.println(x + " pushed into stack");
        System.out.println("Current minimum: " + minStack.peek());
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }

        System.out.println(removed + " popped from stack");

        if (!minStack.isEmpty()) {
            System.out.println("Current minimum: " + minStack.peek());
        } else {
            System.out.println("Stack is now empty");
        }

        return removed;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return minStack.peek();
    }
}

public class MinStack {
    public static void main(String[] args) {

        MinStackMethods minStack = new MinStackMethods();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Minimum element: " + minStack.getMin());

        minStack.pop();
        minStack.pop();

        System.out.println("Minimum element: " + minStack.getMin());
    }
}
