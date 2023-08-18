package memoization;

public class WhoWins {

    // Solution: https://thedailybyte.dev/solution/70?token=cabd4739a37aa7f37fc2381cf963875c7b0cd855aaef1b1afa53350990ea09fb
    // Runtime: O(N2) where N is the total number of elements in nums.
    // Space complexity: O(N2) where N is the total number of elements in nums. This results from our 2D matrix (which is size N x N).
    public boolean findTheWinner(int[] nums) {
        int[][] memoize = new int[nums.length][nums.length];
        if (play(nums, 0, nums.length - 1, memoize) >= 0) {
            return true;
        }

        return false;
    }

    public int play(int[] nums, int start, int end, int[][] memoize) {
        if (start == end) {
            return nums[start];
        }
        if (memoize[start][end] != 0) {
            return memoize[start][end];
        }

        int left = nums[start] - play(nums, start + 1, end, memoize);
        int right = nums[end] - play(nums, start, end - 1, memoize);
        memoize[start][end] = Math.max(left, right);
        return memoize[start][end];
    }
}
