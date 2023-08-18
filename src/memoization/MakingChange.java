package memoization;

public class MakingChange {

    // Solution: https://thedailybyte.dev/solution/71?token=0c4fb65eabe9da25040b25e3a48e374d74c24be683b0eb27a4dd7f0a2edd1981
    // Runtime: O(N*M) where N is the amount that we’re given and M is the total number of denominations we’re given (i.e. coins.length).
    // Space complexity: O(N) where N is the amount we’re given. This results from creating an integer array of size N to memoize the results of subproblems.
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }

        return makeChange(coins, amount, new int[amount]);
    }

    public int makeChange(int[] coins, int remaining, int[] memoize) {
        if (remaining < 0) {
            return -1;
        }
        if (remaining == 0) {
            return 0;
        }
        if (memoize[remaining - 1] != 0) {
            return memoize[remaining - 1];
        }

        int min = Integer.MAX_VALUE;
        for (int coin: coins) {
            int numCoins = makeChange(coins, remaining - coin, memoize);
            if (numCoins >= 0 && numCoins < min) {
                min = 1 + numCoins;
            }
        }
        memoize[remaining - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return memoize[remaining - 1];
    }
}
