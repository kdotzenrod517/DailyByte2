package binarysearchtree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInorderTraversal {

    // Solution: https://thedailybyte.dev/solution/46?token=608eef7483f9cd6d913ed2f4245c13109b4b2d0f8f853b4207ddc80380bb7e49
    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public List<Integer> getInorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }
}
