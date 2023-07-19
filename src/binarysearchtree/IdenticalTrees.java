package binarysearchtree;

import javax.swing.plaf.SplitPaneUI;

public class IdenticalTrees {

    public static void main(String[] args) {

    }

    // Runtime: O(N) where N is the total number of nodes between p and q
    // Space complexity: O(N) where N is the total number of nodes between p and q (due to our recursive calls).
    public static boolean areIdentical(TreeNode a, TreeNode b){
        if(a == null && b == null){
            return true;
        } else if (a == null || b == null){
            return false;
        } else if (a.val != b.val){
            return false;
        } else {
            return areIdentical(a.left, b.left) &&
                    areIdentical(a.right, b.right);
        }
    }
}
