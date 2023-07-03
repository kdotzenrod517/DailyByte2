package stacks;

import java.util.Stack;

public class ValidateCharacters {

    public static void main(String[] args) {
        System.out.println(validOrder("(){}[]")); // true
        System.out.println(validOrder("(({[]}))")); // true
        System.out.println(validOrder("{(})")); // false
    }

    // Runtime: O(N) where N is the number of characters in our string.
    // Space complexity: O(N) where N is the number of characters in our string.
    public static boolean validOrder(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(char c: s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if(c == ')' && (stack.isEmpty() || stack.peek() != '(')) {
                return false;
            } else if(c == ']' && (stack.isEmpty() || stack.peek() != '[')) {
                return false;
            } else if(c == '}' && (stack.isEmpty() || stack.peek() != '{')) {
                return false;
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
