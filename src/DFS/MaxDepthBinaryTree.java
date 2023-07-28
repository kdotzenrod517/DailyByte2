package DFS;

import binarysearchtree.TreeNode;

import java.util.Map;

public class MaxDepthBinaryTree {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

}
