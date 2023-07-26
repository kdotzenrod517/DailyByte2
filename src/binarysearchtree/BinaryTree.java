package binarysearchtree;

import static binarysearchtree.TreeNode.addRecursive;

public class BinaryTree {

    public TreeNode root;

    public void add(int value) {
        root = addRecursive(root, value);
    }
}