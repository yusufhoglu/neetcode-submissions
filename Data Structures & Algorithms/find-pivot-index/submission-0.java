class Solution {
    public int pivotIndex(int[] nums) {
        int preSum = 0;
        int[] preArr = new int[nums.length + 1];
        int c = 0;
        preArr[0] = 0;
        for (int i = 1; i < preArr.length; i++) {
            preSum += nums[i - 1];
            preArr[i] = preSum;
        }

        int res = -1;
        int lastIndx = preArr.length-1;
        for (int i = 1; i < preArr.length; i++) {
            if(preArr[lastIndx] - preArr[i] == preArr[i - 1]) return i - 1;
        }   
        return res;
    }
}