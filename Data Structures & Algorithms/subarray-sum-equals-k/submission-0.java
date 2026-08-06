class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] preArr = new int[nums.length + 1];
        preArr[0] = 0;
        int idx = 1;
        int total = 0;
        for (int num: nums) {
            total += num;
            preArr[idx++] = total;
        }
        int counter =0;
        for (int i = preArr.length -1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if(preArr[i] - preArr[j] == k) counter++;
            }
        }
        return counter;
    }
}