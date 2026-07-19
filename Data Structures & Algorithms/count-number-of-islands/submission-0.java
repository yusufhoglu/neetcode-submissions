class Solution {
    int ROW, COL;
    public int numIslands(char[][] grid) {
        this.ROW = grid.length;
        this.COL = grid[0].length;
        int island = 0;
        for (int i = 0; i < ROW ; i++) {
            for (int j = 0; j < COL; j++) {
                if(grid[i][j] == '1') {
                    island++;
                    dfs(grid, i, j);
                }
            }
        }
        return island;
    }

    private void dfs (char[][] arr, int r, int c) {
        if (Math.min(r, c) < 0 || r >= ROW || c >= COL ) return;
        else if (arr[r][c] == '1') arr[r][c] = '0';
        else if (arr[r][c] == '0') return;

        dfs(arr , r + 1 , c);
        dfs(arr , r - 1 , c);
        dfs(arr , r , c + 1);
        dfs(arr , r , c - 1);
    }
}
