class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0 || grid[n-1][n-1] != 0) return -1;
        int[][] directions = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1,-1}};
        Queue<int[]> queue =  new LinkedList<>();
        queue.offer(new int[]{0 , 0});
        grid[0][0] = 1;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0], c = cur[1];
            int dist = grid[r][c];

            if(r == n-1 && c == n-1) return dist;

            for(int[] direction: directions) {
                int nr = r + direction[0], nc = c + direction[1];
                if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 0) {
                    grid[nr][nc] = dist + 1;
                    queue.offer(new int[]{nr, nc});
                }
            } 
        }
        return -1;
    }
}