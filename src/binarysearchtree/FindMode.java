package binarysearchtree;

import java.util.HashMap;

public class FindMode {

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    public int findMode(TreeNode root) {
        int result = -1;
        if(root == null) {
            return result;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        inorder(root, map);

        int max = Integer.MIN_VALUE;
        for(int key: map.keySet()) {
            int count = map.get(key);
            if (count > max) {
                max = count;
                result = key;
            }
        }

        return result;
    }

    public void inorder(TreeNode root, HashMap<Integer, Integer> map) {
        if(root.left != null) {
            inorder(root.left, map);
        }

        map.put(root.val, map.getOrDefault(root.val, 0) + 1);

        if(root.right != null) {
            inorder(root.right, map);
        }
    }
}
