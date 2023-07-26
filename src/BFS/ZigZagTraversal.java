package BFS;

import binarysearchtree.TreeNode;

import java.util.*;

public class ZigZagTraversal {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public List<List<Integer>> zigzagTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            Deque<Integer> level = new LinkedList<Integer>();
            for(int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                if(count % 2 == 0) {
                    level.addLast(current.val);
                } else {
                    level.addFirst(current.val);
                }

                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
            }

            count++;
            result.add(new ArrayList<Integer>(level));
        }

        return result;
    }
}
