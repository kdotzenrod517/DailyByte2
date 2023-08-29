package math;

public class GymLockers {

    // Solution: https://thedailybyte.dev/solution/83?token=064369dcd6aae347fac22a1063cbcb3b5a1eb166a90b203115c3b8367f0747d5
    // Runtime: O(1) or constant.
    // Space complexity: O(1) or constant.
    public int gymLockers(int n) {
        return (int)Math.sqrt(n);
    }
}
