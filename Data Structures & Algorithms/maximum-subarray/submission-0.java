class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        int L = 0;

        for (int R = 0; R < nums.length; R++) {
            if (currSum < 0) {
                currSum = 0;
                L =R;
            }
            currSum += nums[R];
            if (currSum > maxSum) maxSum = currSum;
        }
        return maxSum;
    }
}
