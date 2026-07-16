class Solution {
    public void sortColors(int[] nums) {
        int[] arr = {0,0,0};
        int k = 0;
        for(int num:nums) {
            arr[num] += 1;                       
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i] ; j++) {
                nums[k++] = i;
            }
        }
    }
}