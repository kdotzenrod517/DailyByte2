package greedyalgos;

import java.util.Arrays;

public class MovingBricks {

    // Solution: https://thedailybyte.dev/solution/67?token=686cbc9a7c8054562dc53a87be643decdd65e2f5e88aa40375933b03dfad2f7b
    // Runtime: O(NlogN) where N is the total number of bricks we are given. This results from sorting our array.
    // Space complexity: O(1) or constant as the memory we use to solve our problem does not increase as our number of bricks increases.
    public int movingBricks(int[] bricks) {
        Arrays.sort(bricks);
        int count = 0;
        int weight = 0;
        for (int i = 0; i < bricks.length; i++) {
            if (weight + bricks[i] < 5000) {
                count++;
                weight += bricks[i];
            } else {
                return count;
            }
        }

        return count;
    }
}
