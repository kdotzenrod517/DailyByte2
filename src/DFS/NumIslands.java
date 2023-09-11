package DFS;

public class NumIslands {

    // Runtime: O(N2) where N is the number of rows and columns in our grid.
    // Space complexity: O(N2) where N is the number of rows and columns in our grid (due to our recursive calls on the stack).
    public static void main(String[] args) {
        System.out.println(numIslands(new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 1},
        })); // 3
        System.out.println(numIslands(new int[][]{
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 1, 0},
        })); // 4
    }

    public static int numIslands(int[][] numIslands){

        int count = 0;

        if(numIslands == null || numIslands.length == 0){
            return count;
        }

        for(int i = 0; i < numIslands.length; i++){
            for(int j = 0; j < numIslands[i].length; j++){
                if(numIslands[i][j] == 1){
                    count++;
                    dfs(i, j, numIslands);
                }
            }
        }

        return count;
    }

    public static void dfs(int i, int j, int[][] numIslands){
        if(i < 0 || i >= numIslands.length || j < 0 || j >= numIslands[i].length ||
        numIslands[i][j] == 0){
            return;
        }

        numIslands[i][j] = 0;
        dfs(i + 1, j, numIslands);
        dfs(i - 1, j, numIslands);
        dfs(i, j + 1, numIslands);
        dfs(i, j - 1, numIslands);
    }
}
