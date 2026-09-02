class Solution {
    int[] nums;
    public List<List<Integer>> subsetsWithDup(int[] nums) { 
        Arrays.sort(nums);
        this.nums = nums;
        int i = 0;
        List<List<Integer>> subSet = new ArrayList<List<Integer>>();
        List<Integer> currSet = new ArrayList<Integer>();
        dfs(i, subSet, currSet);
        return subSet;
    }

    public void dfs(int i, List<List<Integer>> subSet, List<Integer> currSet) {
        if (i >= nums.length) {
            subSet.add(List.copyOf(currSet));
            return;
        }
        currSet.add(nums[i]);
        dfs(i + 1, subSet, currSet);
        currSet.remove(currSet.size()-1);

        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
             i++;
        }
        dfs(i + 1, subSet, currSet);
    }
}
