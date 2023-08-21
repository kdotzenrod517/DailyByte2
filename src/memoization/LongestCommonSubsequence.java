package memoization;

public class LongestCommonSubsequence {

    // Solution: https://thedailybyte.dev/solution/75?token=98a9b6ceff5ed633da0e53d11b8e477057fc634987b662ec4a0264bdfc2f6b49
    // Runtime: O(N * M) where N is the number of characters in s and M is the number of characters in t.
    // Space complexity: O(N * M) where N is the number of characters in s and M is the number of characters in t. This results from storing our M * N subproblems in our memoize matrix.
    public int longestCommonSubsequence(String s, String t) {
        int[][] memoize = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                memoize[i][j] = -1;
            }
        }

        return findLongestSubsequence(0, 0, s, t, memoize);
    }

    public int findLongestSubsequence(int i, int j, String s, String t, int[][] memoize) {
        if (memoize[i][j] != -1) {
            return memoize[i][j];
        }

        int length = 0;
        if (s.charAt(i) == t.charAt(j)) {
            length = 1 + findLongestSubsequence(i + 1, j + 1, s, t, memoize);
        } else {
            length = Math.max(findLongestSubsequence(i + 1, j, s, t, memoize), findLongestSubsequence(i, j + 1, s, t, memoize));
        }

        memoize[i][j] = length;
        return memoize[i][j];
    }
}
