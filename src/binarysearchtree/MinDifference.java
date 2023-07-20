package binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class MinDifference {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public int minimumDifference(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        inorder(root, inorder);

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < inorder.size() - 1; i++) {
            min = Math.min(min, inorder.get(i + 1) - inorder.get(i));
        }

        return min;
    }

    public void inorder(TreeNode root, List<Integer> inorder) {
        if(root == null) {
            return;
        }

        inorder(root.left, inorder);
        inorder.add(root.val);
        inorder(root.right, inorder);
    }
}
