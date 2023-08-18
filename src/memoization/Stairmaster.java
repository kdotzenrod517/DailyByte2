package memoization;

public class Stairmaster {

    // Solution: https://thedailybyte.dev/solution/76?token=ed9bc19947b2066d899180d07263cc5a7d016a70c2aeddfb8b4766a2ef791330
    // Runtime: O(N) where N is the total number of elements in cost.
    // Space complexity: O(N) where N is the total number of elements in cost. This extra space results in our memoize array.
    public int minCostStairs(int[] cost) {
        int[] memoize = new int[cost.length];
        return Math.min(climbSteps(cost.length - 1, cost, memoize), climbSteps(cost.length - 2, cost, memoize));
    }

    public int climbSteps(int step, int[] cost, int[] memoize) {
        if (step == 0 || step == 1) {
            return cost[step];
        } else if (memoize[step] != 0) {
            return memoize[step];
        } else {
            memoize[step] = cost[step] + Math.min(climbSteps(step - 1, cost, memoize), climbSteps(step - 2, cost, memoize));
            return memoize[step];
        }
    }
}
