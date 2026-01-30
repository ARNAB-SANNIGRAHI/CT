package dsa_DAY2_Assignment;

import java.util.Stack;

public class PalindromeStack {
    public static void main(String[] args) {
        String str = "madam";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        String rev = "";
        while (!stack.isEmpty()) {
            rev += stack.pop();
        }

        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}

