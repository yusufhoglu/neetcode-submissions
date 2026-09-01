class Solution {
    int nums[];
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        List<List<Integer>> subset = new ArrayList<>();
        List<Integer> currset = new ArrayList<>();
        handler(0, subset, currset);
        return subset;
    }

    public void handler(int i, List<List<Integer>> subset, List<Integer> currset) {
        if (i >= nums.length) {
            subset.add(new ArrayList<>(currset));
            return;
        }

        currset.add(nums[i]);
        handler(i + 1, subset, currset);
        currset.remove(currset.size()-1);

        handler(i + 1, subset, currset);
    }
}
