package dynamicprogramming;

public class PaintingHouses {

    // Solution: https://thedailybyte.dev/solution/79?token=3c4a871c92cc4c92761bbf686eddbb8c26e3536803fbe2e7becbe49631c1928c
    // Runtime: O(N) where N is the total number of houses we are given (i.e. costs.length).
    // Space complexity: O(1) or constant since we are reusing the costs matrix we are given in the problem.
    public int minimumCostToPaintHouses(int[][] costs) {
        if(costs == null || costs.length == 0) {
            return 0;
        }

        for(int i = 1; i < costs.length; i++) {
            costs[i][0] += Math.min(costs[i - 1][1], costs[i - 1][2]);
            costs[i][1] += Math.min(costs[i - 1][0], costs[i - 1][2]);
            costs[i][2] += Math.min(costs[i - 1][0], costs[i - 1][1]);
        }

        return Math.min(costs[costs.length - 1][0], Math.min(costs[costs.length - 1][1], costs[costs.length - 1][2]));
    }
}
