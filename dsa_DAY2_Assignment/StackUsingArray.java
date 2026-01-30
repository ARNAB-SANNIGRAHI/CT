package dsa_DAY2_Assignment;

class StackUsingArrayMethods {

	private int[] stack;
	private int top;
	private int size;

	public StackUsingArrayMethods(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}

	public void push(int data) {
		if (top == size - 1) {
			throw new RuntimeException("Stack Overflow");
		}
		stack[++top] = data;
	}

	public int pop() {
		if (top == -1) {
			throw new RuntimeException("Stack Underflow");
		}
		return stack[top--];
	}

	public int peek() {
		if (top == -1) {
			throw new RuntimeException("Stack is Empty");
		}
		return stack[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}
}

public class StackUsingArray {
	public static void main(String[] args) {
		StackUsingArrayMethods stack = new StackUsingArrayMethods(4);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Top Element: " + stack.peek());

		stack.pop();

		System.out.println("Updated top element: " + stack.peek());

	}
}
