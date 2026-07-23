class Solution {
    int COL;
    int ROW;
    int[][] grid;
    int localMaxArea = 0;
    int[][] directions;
    public int maxAreaOfIsland(int[][] grid) {
        directions = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        COL = grid[0].length;
        ROW = grid.length;
        this.grid = grid;
        int maxArea = 0;
        for(int i = 0; i < ROW; i++) {
            for(int j = 0; j < COL; j++) {
                if (grid[i][j] == 1) {
                    dfs(i, j);
                    if (localMaxArea > maxArea) maxArea = localMaxArea;
                }
            }
        }
        return maxArea;
    }

    private int dfs(int r, int c) {
        if (r < 0 || c < 0 || c >= COL || r >= ROW || grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;

        localMaxArea = 1;
        for (int[] direc: directions) {
            localMaxArea += dfs(r + direc[0], c + direc[1]);
        }
        return localMaxArea;
    }

}
