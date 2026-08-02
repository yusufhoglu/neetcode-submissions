class Solution {
    public int maxProfit(int[] prices) {
        int L, R;
        L = R = prices.length - 1;
        int max = 0;

        while (L > 0) {
            if(prices[L] > prices[L-1]) {
                max = Math.max(prices[R] - prices[L-1], max);
                L--;
            } else {
                if (prices[R] < prices[L-1]) R = L -1;
                L--;
            }
        }
        return max;
    }
}
