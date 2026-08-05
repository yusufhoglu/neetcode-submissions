class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length < 2) return 1;
        int nextSign = -1; //0 for - 1 for +
        int L = 0;
        int maxSize = 0;
 
        for (int R = 1; R < arr.length; R++) {
            int diff = arr[R] - arr[R - 1];
    
            if (diff > 0 && (nextSign == 1 || nextSign == -1)) {
                maxSize = Math.max(maxSize, R - L + 1);
                nextSign = 0;
            } else if(diff < 0 && (nextSign == 0 || nextSign == -1)){
                maxSize = Math.max(maxSize, R - L + 1);
                nextSign = 1;
            } else if (diff == 0) {
                L = R;
                nextSign = -1;
            } else {
                L = R - 1;
            }
        }

        return maxSize == 0 ? 1: maxSize;
    }
}