class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int R = 0;        
        for (int L = 0; L < nums.length - 1; L++) {
            while (R - L <= k && R < nums.length){
                if (nums[L] == nums[R] && L != R) return true;
                R++;
            }
            R = L +1;
        }
        return false;
    }
}