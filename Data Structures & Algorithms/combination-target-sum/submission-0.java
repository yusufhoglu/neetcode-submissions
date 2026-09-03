class Solution {
    List<List<Integer>> combination;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> currArr= new ArrayList<>();
        combination = new ArrayList<>();
        Arrays.sort(nums);
        backtracing(0, nums, currArr, target, 0);
        return combination;
    }

    public void backtracing(int index, int[] nums, List<Integer> currArr, int target, int sum) {
        if (sum == target) {
            combination.add(new ArrayList<>(currArr));
            return;
        }
        if (sum > target || index >= nums.length) return;

        currArr.add(nums[index]);
        sum += nums[index];
        backtracing(index, nums, currArr, target, sum);
        currArr.remove(currArr.size() - 1);
        sum -= nums[index];
        
        backtracing(index + 1, nums, currArr, target, sum);
    }
}
