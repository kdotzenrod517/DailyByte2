package BFS;

import binarysearchtree.BinaryTree;
import binarysearchtree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GatherLevels {

    public static void main(String[] args) {
        BinaryTree bt1 = new BinaryTree();
        bt1.add(4);
        bt1.add(2);
        bt1.add(7);
        System.out.println(gatherLevels(bt1.root));

    }

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public static List<List<Integer>> gatherLevels(TreeNode root){
        List<List<Integer>> levels = new ArrayList<>();
        if(root == null) {
            return levels;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                currentLevel.add(current.val);
                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
            }

            levels.add(currentLevel);
        }

        return levels;
    }
}
