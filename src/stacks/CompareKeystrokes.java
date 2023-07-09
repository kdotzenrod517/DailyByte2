package stacks;

import java.util.Stack;

public class CompareKeystrokes {

    public static void main(String[] args) {
        System.out.println(compareKeystrokes("ABC#", "CD##AB")); // true
        System.out.println(compareKeystrokes("como#pur#ter", "computer")); // true
        System.out.println(compareKeystrokes("cof#dim#ng", "code")); // false
    }

    // Runtime: O(N + M) where N is the number of characters in s and M is the number of characters in t.
    // Space complexity: O(N + M) where N is the number of characters in s and M is the number of characters in t.
    public static boolean compareKeystrokes(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c != '#') {
                stack1.push(c);
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }

        for (Character c : t.toCharArray()) {
            if (c != '#') {
                stack2.push(c);
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }

        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.pop() != stack2.pop()) {
                return false;
            }
        }

        return stack1.isEmpty() && stack2.isEmpty();
    }
}
