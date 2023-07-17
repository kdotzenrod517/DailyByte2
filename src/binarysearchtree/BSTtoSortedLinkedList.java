package binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class BSTtoSortedLinkedList {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public TreeNode convertBSTToSortedLinkedList(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inorder(root, values);
        TreeNode result = new TreeNode();
        TreeNode current = result;
        for (int value: values) {
            current.right = new TreeNode(value);
            current = current.right;
        }

        return result.right;
    }

    public void inorder(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }

        inorder(root.left, values);
        values.add(root.val);
        inorder(root.right, values);
    }
}
