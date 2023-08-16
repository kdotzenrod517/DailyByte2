package greedyalgos;

public class PopsicleStand {

    // Solution: https://thedailybyte.dev/solution/64?token=5cf223f4f5e4db113aa92416f60d9449a5706da0d3e1cd04ec05f77a2695c23c
    // Runtime: O(N) where N is the number of customers we’re given.
    // Space complexity: O(1) or constant as the memory we use to solve the problem does not increase as our number of customers increases.
    public boolean popsicleStand(int[] customers) {
        int fives = 0;
        int tens = 0;
        for (int customer: customers) {
            if (customer == 5) {
                fives++;
            } else if (customer == 10 && fives == 0) {
                return false;
            } else if (customer == 10) {
                fives--;
                tens++;
            } else if (fives > 0 && tens > 0) {
                fives--;
                tens--;
            } else if (fives >= 3) {
                fives -= 3;
            } else {
                return false;
            }
        }

        return true;
    }
}
