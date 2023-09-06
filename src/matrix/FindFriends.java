package matrix;

import java.util.Arrays;

public class FindFriends {

    // Solution: https://thedailybyte.dev/solution/86?token=c6e9d5caf6c0a171028c30fd49a02db7a7cfa6e26bde31638001f4927e1e8e26
    // Runtime: O(N3) where N is the number of coworkers we’re given. This results from iterating through our N * N matrix and for each value that is equal to one, we can iterate through all of the N coworkers in the worst case.
    // Space complexity: O(N) where N is the number of coworkers we’re given (i.e. friends.length). This results from creating our parent array that is of size N.
    public int findFriends(int[][] friends) {
        int[] parent = new int[friends.length];
        Arrays.fill(parent, -1);
        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (friends[i][j] == 1 && i != j) {
                    union(parent, i, j);
                }
            }
        }

        int friendGroups = 0;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == -1)
                friendGroups++;
        }

        return friendGroups;
    }

    private void union(int parent[], int x, int y) {
        int xSet = find(parent, x);
        int ySet = find(parent, y);
        if (xSet != ySet) {
            parent[xSet] = ySet;
        }
    }

    private int find(int parent[], int i) {
        if (parent[i] == -1) {
            return i;
        }

        return find(parent, parent[i]);
    }
}
