package memoization;

public class GaltonBoard {

    // Solution: https://thedailybyte.dev/solution/73?token=9a731b802b5dcff37a66837d9196226ae2ca95649bdf0dc6f64e482fbe4e2d81
    // Runtime: O(M * N) where M is the total number of rows in our board and N is the total number of columns in our board.
    // Space complexity: O(M * N) where M is the total number of rows in our board and N is the total number of columns in our board. This results from initializing our memoize array to remember solutions to our subproblems.
    public int galtonBoard(int M, int N) {
        return findPaths(0, 0, new int[M][N]);
    }

    public int findPaths(int row, int col, int[][] memoize) {
        if (row >= memoize.length || col >= memoize[row].length) {
            return 0;
        } else if (row == memoize.length - 1 || col == memoize[row].length - 1) {
            return 1;
        } else if (memoize[row][col] > 0) {
            return memoize[row][col];
        } else {
            memoize[row][col] = findPaths(row + 1, col, memoize) + findPaths(row, col + 1, memoize);
            return memoize[row][col];
        }
    }
}
