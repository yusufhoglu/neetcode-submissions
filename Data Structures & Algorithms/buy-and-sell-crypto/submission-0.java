class Solution {
    public int maxProfit(int[] prices) {
        int R = prices.length - 1, max = 0;
        while (R > 0) {
            for (int i = 0; i < R; i++) {
                max = Math.max(prices[R] - prices[i], max);
            }
            R--;
        }
        return max > 0 ? max : 0;
    }
}
