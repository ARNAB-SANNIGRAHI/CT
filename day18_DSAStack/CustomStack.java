package day18_DSAStack;

class CustomStackMethods {
    private int[] stack;
    private int size;
    private int top;

    public CustomStackMethods(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int push(int element) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        stack[++top] = element;
        return element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return stack[top];
    }

    public int size() {
        return top + 1;
    }
}

public class CustomStack {
    public static void main(String[] args) {
        CustomStackMethods stack = new CustomStackMethods(4);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Current size: " + stack.size());
    }
}
