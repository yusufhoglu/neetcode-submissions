class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int offset = 1;
        int power = 1;
        dp[0] = 0;
        
        for (int i = 1; i < n + 1; i++) {
            if(i == Math.pow(2, power)) {
                offset *= 2;
                power++;
            }
            dp[i] = 1 + dp[i - offset];
        }

        return dp;
    }
}
