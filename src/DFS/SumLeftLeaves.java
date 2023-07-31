package DFS;

import binarysearchtree.TreeNode;

public class SumLeftLeaves {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public int sumLeftLeaves(TreeNode root){
        if(root == null){
            return 0;
        } else if (root.left != null && root.left.left == null){
            return root.left.val + sumLeftLeaves(root.right);
        } else {
            return sumLeftLeaves(root.left) + sumLeftLeaves(root.right);
        }
    }
}
