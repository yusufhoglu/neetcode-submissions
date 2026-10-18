class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return Arrays.asList(new ArrayList<>());
        }

        List<List<Integer>> perm = this.permute(Arrays.copyOfRange(nums, 1, nums.length));
        List<List<Integer>> res = new ArrayList<>();
        for(List<Integer> p: perm) {
            for(int i = 0; i <= p.size(); i++) {
                List<Integer> copy_p = new ArrayList<>(p);
                copy_p.add(i, nums[0]);
                res.add(copy_p);
            }
        }
        return res;
    }
}
