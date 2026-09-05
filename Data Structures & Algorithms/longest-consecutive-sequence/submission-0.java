class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        int res = 0;
    
        for (int num: nums) {
            set.add(num);
        }

        for (int num: set) {
            if(!set.contains(num - 1)) {
                int counter = 1;
                while(set.contains(num + counter)) {
                    counter++;
                }
                res = Math.max(counter, res);
            }
        }

        return res;
    }
}
