package BFS;

import binarysearchtree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class VisibleValues {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public List<Integer> visibleValues(TreeNode root) {
        List<Integer> visibleValues = new ArrayList<>();
        if(root == null) {
            return visibleValues;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                if(i == 0) {
                    visibleValues.add(current.val);
                }
                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        return visibleValues;
    }
}
