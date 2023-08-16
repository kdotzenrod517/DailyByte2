package greedyalgos;

import java.util.Arrays;

public class FlightPrices {

    // Solution: https://thedailybyte.dev/solution/66?token=679f4f71616e674d2f360deedabd1f4e1669c907de6b2b7ece0d1095bb238e33
    // Runtime: O(NlogN) where N is the total number of elements in prices. This overhead results from sorting our prices.
    // Space complexity: O(1) or constant as the memory we use to solve the problem does not scale as the number of elements in prices gets larger.
    public int flightCosts(int[][] prices) {
        Arrays.sort(prices, (a, b) -> {
            return a[0] - a[1] - (b[0] - b[1]);
        });

        int minCost = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i < prices.length / 2) {
                minCost += prices[i][0];
            } else {
                minCost += prices[i][1];
            }
        }

        return minCost;
    }
}
