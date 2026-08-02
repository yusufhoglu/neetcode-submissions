class Solution {
    public int maxArea(int[] heights) {
        int L = 0, R = heights.length - 1, max = 0;
        
        while (L < R) {
            if (heights[L] <= heights[R]) {
                max = Math.max(heights[L] * (R - L), max);
                L++;
            } else {
                max = Math.max(heights[R] * (R - L), max);
                R--;
            }
        }
        
        return max;
    }
}
