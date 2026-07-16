class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] arr = new int[2*length];

        int index = 0;
        for(int num : nums) {
            arr[index] = num;
            arr[index++ + length] = num;
        }

        return arr;
    }
}