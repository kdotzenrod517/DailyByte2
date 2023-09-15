package DP;

public class ArtGalleryThief {

    // Solution: https://thedailybyte.dev/solution/81?token=f1472fda241ab1e6a029696c5a5bdd8f2735c3d5893e8c1ee4ae318450f848e5
    // Runtime: O(N * M) where N is the length of weights and M is the length of values.
    // Space complexity: O(N * M) where N is the length of weights and M is the length of values. This results from our dp array.
    public int robMuseum(int W, int[] weights, int[] values) {
        int[][] dp = new int[values.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (j < weights[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(values[i] + dp[i - 1][j - weights[i]], dp[i - 1][j]);
                }
            }
        }

        return dp[values.length][W];
    }
}
