package dynamicprogramming;

public class Stairs {

    // Solution: https://thedailybyte.dev/solution/68?token=f4da7e4f87e002b55c64618b89426e7b98da6abbd9b918e2a5c4a14a2ab320eb
    // Runtime: O(N) where N is the number of steps in the staircase.
    // Space complexity: O(1) or constant as regardless of the size of N we only need a few variables to solve our problem.
    public int stairs(int n) {
        if(n == 1) {
            return 1;
        }

        int first = 1;
        int second = 2;
        for(int i = 3; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }

        return second;
    }
}
