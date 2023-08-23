package dynamicprogramming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DictionaryWords {

    // Solution: https://thedailybyte.dev/solution/80?token=f7d94af21260e8e66a8bbfcec096dd41601177d05695820b7f4b1ca640d71d60
    // Big-O Analysis Runtime: O(N2) where N is the total number of characters in s. This results from our two nested loops as well as the s.substring() calls which requires O(N) time.
    // Space complexity: O(N) where N is the total number of character in s.
    public boolean segmentWords(String s, List<String> dictionary) {
        Set<String> words = new HashSet<>(dictionary);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && words.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
