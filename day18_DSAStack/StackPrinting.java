package day18_DSAStack;

import java.util.Stack;

public class StackPrinting {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);

		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i) + " ");
		}

		System.out.println();

		for (int element : stack) {
			System.out.print(element + " ");
		}

		System.out.println();

		int i = 0;
		while (i < stack.size()) {
			System.out.print(stack.get(i) + " ");
			i++;
		}
	}
}