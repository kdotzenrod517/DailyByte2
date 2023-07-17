package binarysearchtree;

public class FindValue {

    public static void main(String[] args) {

    }

    // Runtime: O(log(N)) where N is the number of nodes in our binary search tree (assuming our tree is balanced).
    // Space complexity: O(log(N)) where N is the number of nodes in our binary search tree (assuming our tree is balanced). This extra space is as a result of the recursive calls on the stack.
    public static TreeNode findValue(TreeNode root, int val){
        if(root == null){
            return null;
        } else if (root.val == val){
            return root;
        } else if (val < root.val){
            return findValue(root.left, val);
        } else {
            return findValue(root.right, val);
        }

    }
}
