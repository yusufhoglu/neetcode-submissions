class Solution {
    int COL;
    int ROW;
    int[][] grid;
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        COL = grid[0].length;
        ROW = grid.length;
        int min = 0;
        int fresh = 0;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }
                if (grid[i][j] == 2) {
                    queue.offer(new int[] {i, j});
                }
            }
        }
        int[][] directions = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (fresh > 0 && !queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0], c = curr[1];

                for (int[] direction : directions) {
                    int nc = c + direction[1], nr = r + direction[0];
                    if (nc < 0 || nr < 0 || nc >= COL || nr >= ROW || grid[nr][nc] == 0
                        || grid[nr][nc] == 2) {
                        continue;
                    }
                    grid[nr][nc] = 2;
                    queue.offer(new int[] {nr, nc});
                    fresh--;
                }
            }
            min++;
        }
        return fresh == 0? min: -1;
    }
}
