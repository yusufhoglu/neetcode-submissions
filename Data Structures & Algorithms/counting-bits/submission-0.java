class Solution {
    public int[] countBits(int n) {
        int counter = 0;
        int[] countArr = new int[n+1];
        countArr[0] = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                if((num & 1) == 1) counter++;
                num = num >> 1;
            }
            countArr[i] = counter;
            counter = 0;
        }
        return countArr;
    }
}
