package greedyalgos;

import java.util.Arrays;

public class MaxPoints {

    // Solution: https://thedailybyte.dev/solution/62?token=55f5149911f728f8a991188dee7fdec7ac55c909f99a41c761dc1c4a8997471d
    // Runtime: O(NlogN) where N is the total number of coins we are given. This results from sorting our coins.
    // Space complexity: O(1) or constant since regardless of the number of coins we are given our memory required to solve the problem does not scale.
    public int maxPoints(int[] coins, int E) {
        Arrays.sort(coins);
        int maxPoints = 0;
        int points = 0;
        int i = 0;
        int j = coins.length - 1;
        while (i <= j) {
            if (E >= coins[i]) {
                points++;
                E -= coins[i++];
                maxPoints = Math.max(maxPoints, points);
            } else if (points > 0) {
                points--;
                E += coins[j--];
            } else {
                return maxPoints;
            }
        }

        return maxPoints;
    }
}
