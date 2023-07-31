package DFS;

import binarysearchtree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SameLeaves {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public boolean sameLeaves(TreeNode root1, TreeNode root2) {
        List<Integer> root1Leaves = new ArrayList<>();
        collectLeaves(root1, root1Leaves);

        List<Integer> root2Leaves = new ArrayList<>();
        collectLeaves(root2, root2Leaves);

        return root1Leaves.equals(root2Leaves);
    }

    public void collectLeaves(TreeNode root, List<Integer> leaves) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                leaves.add(root.val);
            }

            collectLeaves(root.left, leaves);
            collectLeaves(root.right, leaves);
        }
    }
}
