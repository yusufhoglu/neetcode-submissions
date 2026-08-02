class Solution {
    int[][] arr;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        arr = obstacleGrid;
        int[][] memo = new int[arr.length][arr[0].length];

        return memoization(0, 0, memo);
    }
    private int memoization(int r, int c, int[][] memo) {
        if (r >= arr.length || c >= arr[0].length || arr[r][c] == 1) return 0;
        if(r == arr.length-1 && c == arr[0].length -1) return 1;
        if (memo[r][c] != 0) return memo[r][c];

        memo[r][c] = memoization(r + 1, c, memo) + memoization(r, c+1 ,memo);
        return memo[r][c];
    }
}