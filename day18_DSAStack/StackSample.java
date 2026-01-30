package day18_DSAStack;

import java.util.Stack;

public class StackSample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		System.out.println(stack);
		System.out.println(stack.size());
		
		System.out.println("Stack printing using for loop");
		for(int i=0;i<stack.size();i++) {
			System.out.println(stack.get(i));
		}
		
		System.out.println("Stack printing using for loop");
		for(int i=stack.size()-1;i>0;i--) {
			System.out.println(stack.get(i));
		}
		
		System.out.println("Stack reversal using while loop");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
