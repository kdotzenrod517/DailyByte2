package binarysearchtree;

public class LowestCommonAncestor {

    // Runtime: O(log(N)) where N is the number of nodes in our tree (assuming our tree is balanced).
    // Space complexity: O(log(N)) where N is the number of nodes in our tree (assuming our tree is balanced).
    public static TreeNode lca(TreeNode root, TreeNode a, TreeNode b){
        if(a.val < root.val && b.val < root.val){
            return lca(root.left, a, b);
        } else if (a.val > root.val && b.val > root.val){
            return lca(root.right, a, b);
        } else {
            return root;
        }
    }
}
