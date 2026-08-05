class Solution {
    public int removeDuplicates(int[] nums) {
        boolean flag = false;
        int k = 0;
        for (int i = 1; i < nums.length - k; i++) {
            int diff = nums[i] - nums[i-1];
            if(diff == 0) {
                if (flag) {
                    nums = shiftArr(nums, i);
                    k++;
                    i--;
                } else {
                    flag = true;
                }
            } else if(flag) {
                flag = false;
            }
        }
        return nums.length - k;
    }

    private int[] shiftArr(int[] arr, int k) {
        while (k + 1 < arr.length) {
            int temp = arr[k];
            arr[k] = arr[k+1];
            arr[k + 1] = temp;
            k++;
        }
        return arr;
    } 
}