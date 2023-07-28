package DFS;

import binarysearchtree.TreeNode;
import com.sun.source.tree.Tree;

public class ValidBST {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public static boolean isValidBST(TreeNode root){
        return validate(root, null, null);
    }

    public static boolean validate(TreeNode root, Integer max, Integer min){
        if(root == null){
            return true;
        } else if (max != null && root.val >= max || min != null && root.val <= min){
            return false;
        } else {
            return validate(root.left, root.val, min) &&
                    validate(root.right, max, root.val);
        }
    }
}
