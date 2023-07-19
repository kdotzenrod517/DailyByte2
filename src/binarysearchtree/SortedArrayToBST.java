package binarysearchtree;

public class SortedArrayToBST {

    // Runtime: O(N) where N is the number of elements in nums.
    // Space complexity: O(N) where N is the number of elements in nums because we’re constructor a binary search tree with N values from it.
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) {
            return null;
        }

        return buildTree(0, nums.length - 1, nums);
    }

    public TreeNode buildTree(int left, int right, int[] nums) {
        if(left <= right) {
            int mid = left + (right - left) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = buildTree(left, mid - 1, nums);
            root.right = buildTree(mid + 1, right, nums);

            return root;
        }

        return null;
    }
}
