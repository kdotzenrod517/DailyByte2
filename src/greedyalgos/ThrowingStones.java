package greedyalgos;

import java.util.PriorityQueue;

public class ThrowingStones {

    // Solution: https://thedailybyte.dev/solution/63?token=c95306d6fb5e764a275627065572de1192d7eae3eccd0489ab1ed7fab868b8e4
    // Runtime: O(NlogN) where N is the total number of stones we are given. This results from removing N items from our heap where each of the N removals costs O(logN) time (i.e. the height of our heap).
    // Space complexity: O(N) where N is the total number of stones we are given. This results from storing N elements in our max heap.
    public int throwingStones(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int stone: stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();
            if (stone1 != stone2) {
                maxHeap.add(Math.abs(stone1 - stone2));
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.remove();
    }
}
