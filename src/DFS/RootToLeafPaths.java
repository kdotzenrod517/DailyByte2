package DFS;

import binarysearchtree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPaths {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public List<String> rootToLeafPaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        if(root == null) {
            return paths;
        }

        generatePaths(root, paths, "");
        return paths;
    }

    public void generatePaths(TreeNode root, List<String> paths, String current) {
        if(root.left == null && root.right == null) {
            current += root.val;
            paths.add(current);
            return;
        }

        if(root.left != null) {
            generatePaths(root.left, paths, current + root.val + "->");
        }

        if(root.right != null) {
            generatePaths(root.right, paths, current + root.val + "->");
        }
    }
}
