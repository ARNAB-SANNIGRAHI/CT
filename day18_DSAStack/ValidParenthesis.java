package day18_DSAStack;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        ValidParenthesis parenthesis = new ValidParenthesis();

        String string = "[{()}]";   // valid
        String string1 = "[{(}]";   // not valid

        System.out.println(string + " : " + parenthesis.validParenthesis(string));
        System.out.println(string1 + " : " + parenthesis.validParenthesis(string1));
    }

    public boolean validParenthesis(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {


            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 

            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
