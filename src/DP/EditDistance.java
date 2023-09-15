package DP;

public class EditDistance {

    // Solution: https://thedailybyte.dev/solution/78?token=122af664f94092c1a81388afddb3e2fa71d1d1a292b71c69a32795a228573b40
    // Runtime: O(N * M) where N is the total number of characters in s and M is the total number of characters in t.
    // Space complexity: O(N * M) where N is the total number of characters in s and M is the total number of characters in t. This results from creating our dp array of size N * M.
    public int minimumEditDistance(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for(int i = 0; i <= s.length(); i++) {
            for(int j = 0; j <= t.length(); j++) {
                if(i == 0) {
                    dp[i][j] = j;
                } else if(j == 0) {
                    dp[i][j] = i;
                } else if(s.charAt(i - 1) != t.charAt(j - 1)) {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[s.length()][t.length()];
    }
}
