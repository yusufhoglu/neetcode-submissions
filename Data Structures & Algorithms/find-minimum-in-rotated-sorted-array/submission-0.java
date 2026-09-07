class Solution {
    public int findMin(int[] nums) {
        //binary search
        // [1,2,3,4,5,6]
        //         |
        // [4,5,6,1,2,3]
        //        |
        // [6,1,2,3,4,5]
        //        | | 

        int l = 0, r = nums.length-1, mid = 0;

        while (l < r) {
            mid = l + (r-l)/2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        
        return nums[l];
    }
}

