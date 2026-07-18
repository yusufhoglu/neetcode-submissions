class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int num: nums) {
            if(!hash.containsKey(num)) hash.put(num, 1);
            else return true;
        }
        return false;
    }
}