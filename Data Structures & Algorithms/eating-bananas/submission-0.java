class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1,
         right = Arrays.stream(piles).max().getAsInt();
        int res = right;

        while(left <= right) {
            int medium =  left + (right-left)/2;
            int totalHour = this.totalHour(medium, piles);
            if(totalHour <= h) {
                res = medium;
                right = medium - 1;
            }else {
                left = medium + 1;
            }
        }
        return res;
    }

    private int totalHour(int k, int[] arr) {
        int totalHour = 0;
        for (int pile : arr) {
            totalHour += Math.ceil((double)pile/k);
        }
        return totalHour;
    }
}
