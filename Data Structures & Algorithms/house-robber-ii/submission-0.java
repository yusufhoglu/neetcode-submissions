class Solution {
    int[] num;
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];    
        num = nums;
        int[] memo1 = new int[nums.length];
        int[] memo2 = new int[nums.length];
        Arrays.fill(memo1, -1);
        Arrays.fill(memo2, -1);
        return Math.max(dfs(memo1, 0, true), dfs(memo2, 1, false));
    }

    public int dfs(int[] memo, int i, boolean flag) {
        if(i >= num.length || (flag && i == num.length - 1)) return 0;
        if(memo[i] != -1) return memo[i];

        memo[i] = Math.max(dfs(memo, i + 1, flag) , num[i] + dfs(memo, i + 2, flag || i == 0));
        return memo[i];
    }

}
