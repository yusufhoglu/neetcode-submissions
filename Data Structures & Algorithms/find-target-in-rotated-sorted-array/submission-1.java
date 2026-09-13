class Solution {
    public int search(int[] nums, int target) {
        // [5,6,1,2,3,4]
        // mid > left
        // target > mid ==> goto right 
        // target > left ==> goto left
        // target < left ==> goto right
        
        // left > mid 
        // mid > target ==> goto left
        // left > target ==> goto right
        // left < target ==> goto left 

        // [3,1,2]
        // [5,1,2,3,4]
        // [2,3,4,5,1]
        int left = 0, right = nums.length - 1, mid = 0;
        
        while (left <= right) {
            mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] >= nums[left]) {
                if (target > nums[mid] || target < nums[left]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target < nums[mid] || target > nums[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }   
        return -1;
    }
}
