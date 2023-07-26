package BFS;

import binarysearchtree.TreeNode;
import org.w3c.dom.Node;

import java.util.*;

public class GatherNaryTreeLevels {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public List<List<Integer>> getNaryTreeLevels(Node root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if(root == null) {
            return levels;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for(int i = 0; i < size; i++) {
                Node current = queue.remove();
//                level.add(current.val);
//                queue.addAll(current.children);
            }

            levels.add(level);
        }

        return levels;
    }
}
