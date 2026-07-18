class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int index = 0;
        for(int num : nums) {
            if(set.containsKey(num)) return new int[]{set.get(num),index};
            set.put(target - num, index++);
        }
        return new int[0];
    }
}
