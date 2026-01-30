package dsa_DAY2_Assignment;

import java.util.Stack;

public class ReverseString {
public static void main(String[] args) {
	String str = "Java Programming";
	Stack<Character> stack = new Stack<>();
	
	for(char c: str.toCharArray()) {
		stack.push(c);
	}
	String reversed = "";
	while(!stack.isEmpty()) {
		reversed += stack.pop();
	}
	System.out.println(reversed);
}
}
