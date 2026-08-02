class Solution {
    int m;
    int n;
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        this.m = m;
        this.n = n;
        return memoization(0, 0, memo);
    }

    private int memoization(int r, int c, int[][] arr) {
        if (r >= m || c >= n || r < 0 || c <0) return 0;
        if(r == m -1 && c == n-1) return 1;
        if(arr[r][c] != 0) return arr[r][c];
        arr[r][c] = memoization(r + 1, c , arr) + memoization(r , c + 1, arr);
        return arr[r][c];
    }
}
