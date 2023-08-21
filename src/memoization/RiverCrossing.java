package memoization;

import java.util.Arrays;

public class RiverCrossing {

    // Solution: https://thedailybyte.dev/solution/74?token=23818f8e54774bf6edf5a0c5b98ca7389cc63e4d201536c055faf217fcc4cb87
    // Runtime: O(N2) where N is the number of stones we’re given.
    // Space complexity: O(N2) where N is the number of stones we’re given (this results from our memoize matrix).
    public boolean canCross(int[] stones) {
        int[][] memoize = new int[stones.length][stones.length];
        for (int i = 0; i < memoize.length; i++) {
            Arrays.fill(memoize[i], -1);
        }

        return canCross(stones, 0, 0, memoize) == 1;
    }

    public int canCross(int[] stones, int start, int jump, int[][] memoize) {
        if (memoize[start][jump] > -1) {
            return memoize[start][jump];
        }

        for (int i = start + 1; i < stones.length; i++) {
            int nextPosition = stones[i] - stones[start];
            if (nextPosition >= jump - 1 && nextPosition <= jump + 1 && canCross(stones, i, nextPosition, memoize) == 1) {
                memoize[start][jump] = 1;
                return 1;
            }
        }

        memoize[start][jump] = (start == stones.length - 1) ? 1 : 0;
        return memoize[start][jump];
    }
}
