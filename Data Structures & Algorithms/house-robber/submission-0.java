class Solution {
    int length;
    int[] memo;
    public int rob(int[] nums) {
        length = nums.length;
        memo = new int[length];
        Arrays.fill(memo, -1);
        return memoization(nums, 0);
    }
    private int memoization(int[] nums, int i) {
        if(i >= length ) return 0;

        if(memo[i] != -1) return memo[i];
        memo[i] = Math.max(memoization(nums , i + 1), nums[i] + memoization(nums, i + 2));
        return memo[i]; 
    }
}
