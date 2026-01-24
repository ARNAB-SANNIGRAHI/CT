package day14_CollectionFramework;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        // Push elements
        stack.push("Book");
        stack.push("Pen");
        stack.push("Notebook");

        // Print Stack
        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop element
        stack.pop();

        // Check if empty
        System.out.println("Is Stack empty? " + stack.empty());

        // Updated Stack
        System.out.println("Updated Stack: " + stack);
    }
}
