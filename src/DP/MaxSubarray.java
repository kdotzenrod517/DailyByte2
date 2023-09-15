package DP;

public class MaxSubarray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-3,8,-8, 2})); // 8
        System.out.println(maxSubArray(new int[]{2, 3,-4, 2})); // 5 (2 + 3)
        System.out.println(maxSubArray(new int[]{1, 5,-2, -3, 7})); //  8 (1 + 5 + (-2) + (-3) + 7)
    }

    // Runtime: O(N) where N is the number of elements in nums.
    // Space complexity: O(1) or constant as the amount of space we need does not scale with our input nums.
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            max = Math.max(nums[i], max);
        }

        return max;
    }
}
