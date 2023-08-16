package greedyalgos;

public class Lunchtime {

    // Solution: https://thedailybyte.dev/solution/65?token=24fa1b62aaf21958cd0d80b39a91d9829e376c64ed9744fc341038090f710362
    // Runtime: O(N) where N is the number of items we’re given.
    // Space complexity: O(1) or constant as the amount of memory we use does not increase as our number of items increase.
    public int lunchTime(String items) {
        int balancedMeals = 0;
        int count = 0;
        for (int i = 0; i < items.length(); i++) {
            char current = items.charAt(i);
            if (current == 'F') {
                count++;
            } else if (current == 'D') {
                count--;
            }

            if (count == 0) {
                balancedMeals++;
            }
        }

        return balancedMeals;
    }
}
