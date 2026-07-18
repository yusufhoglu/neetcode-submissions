class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        return dfs(image, sr, sc, color, startColor);
    }

    private int[][] dfs(int[][] image, int sr, int sc, int color, int startColor) {
        int ROW = image.length, COL = image[0].length;
        if(sr < 0 || sc < 0 || sr >= ROW || sc >= COL || image[sr][sc] != startColor || image[sr][sc] == color) {
            return image;
        }

        image[sr][sc] = color;

        dfs(image, sr + 1, sc, color, startColor);
        dfs(image, sr - 1, sc, color, startColor);
        dfs(image, sr, sc + 1, color, startColor);
        dfs(image, sr, sc - 1, color, startColor);

        return image;
    }
}