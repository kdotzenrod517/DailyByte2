package DFS;

import binarysearchtree.TreeNode;

public class RootToLeafPathSumWithTarget {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public static boolean hasPathSum(TreeNode root, int target){
        if(root == null){
            return false;
        }

        return hasPathSum(root, target, 0);
    }

    public static boolean hasPathSum(TreeNode root, int target, int sum){
        if(root == null){
            return false;
        } else if (root.left == null && root.right == null && sum + root.val == target){
            return true;
        } else {
            return hasPathSum(root.left, target, sum + root.val) ||
                    hasPathSum(root.right, target, sum + root.val);
        }
    }
}
