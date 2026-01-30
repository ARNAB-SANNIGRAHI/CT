package dsa_DAY2_Assignment;

import java.util.ArrayDeque;
import java.util.Deque;

class StackUsingDequeMethods {

	private Deque<Integer> deque = new ArrayDeque<>();

	public void push(int data) {
		deque.addFirst(data);
		System.out.println(data + " pushed into stack");
	}

	public int pop() {
		if (deque.isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		int value = deque.removeFirst();
		System.out.println(value + " popped from stack");
		return value;
	}

	public int peek() {
		if (deque.isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		return deque.peekFirst();
	}

	public boolean isEmpty() {
		return deque.isEmpty();
	}
}

public class StackUsingDeque {
	public static void main(String[] args) {

		StackUsingDequeMethods stack = new StackUsingDequeMethods();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Top element: " + stack.peek());

		stack.pop();
		stack.pop();

		System.out.println("Is stack empty? " + stack.isEmpty());
	}
}
