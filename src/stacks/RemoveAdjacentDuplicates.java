package stacks;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

    // we will need to remember the order in which our character occur and be
    // able to quickly access the last character we saw at any point in our string.
    // These requirements make a stack a great candidate to help us solve
    // our problem.
    public static void main(String[] args) {
        System.out.println(removeAdjacentDupes("abccba")); //
        System.out.println(removeAdjacentDupes("foobar")); // fbar
        System.out.println(removeAdjacentDupes("abccbefggfe")); // a
    }

    // Runtime: O(N) where N is the number of characters in s.
    // Space complexity: O(N) where N is the number of characters in s.
    public static String removeAdjacentDupes(String s){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(Character c : s.toCharArray()){
            if(!stack.isEmpty() && c == stack.peek()){
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}
