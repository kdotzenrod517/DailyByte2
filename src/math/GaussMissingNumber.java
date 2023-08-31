package math;

public class GaussMissingNumber {

    // Solution: https://thedailybyte.dev/solution/88?token=2463219cff186f7d45b2e43fa22425b56b101bd84069b413a1cbcb3776275f9e
    // Runtime: O(N) where N is the total number of elements in nums. This results from having to iterate through all numbers in nums in order to determine our actual sum.
    // Space complexity: O(1) or constant.
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i: nums) {
            sum += i;
        }

        int n = nums.length;
        return (n * (n + 1) / 2) - sum;
    }
}
