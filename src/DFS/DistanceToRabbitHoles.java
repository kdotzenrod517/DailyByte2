package DFS;

import java.util.Arrays;

public class DistanceToRabbitHoles {


    public static void main(String[] args) {
        int[][] rooms1 = new int[][]{
                {-1, 0, 1},
                {1, 1, -1},
                {1, 1, 0}
        };
        rabbitHoles(rooms1);
        System.out.println(Arrays.deepToString(rooms1));
    }

    // Runtime: ON(^2) where N is the number of rows and columns in our gird (this worst case occurs when our grid is all rabbit holes and we therefore traverse every other cell for each cell).
    // Space complexity: O(N^2) where N is the number of row sand columns in our grid (this overhead is caused by our recursive calls on the stack).
    public static void rabbitHoles(int[][] rooms){

        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[i].length; j++) {
                if(rooms[i][j] == 0) {
                    dfs(i, j, 0, rooms);
                }
            }
        }

    }

    public static void dfs(int i, int j, int count, int[][] rooms){

        if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[i].length || rooms[i][j] < count) {
            return;
        }

        rooms[i][j] = count;
        dfs(i + 1, j, count + 1, rooms);
        dfs(i - 1, j, count + 1, rooms);
        dfs(i, j + 1, count + 1, rooms);
        dfs(i, j - 1, count + 1, rooms);
    }
}
