class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0, kp = 0;
        int counter = 0;
        while (i <= arr.length - k) {
            kp = i;
            int temp = k;
            int sum = 0;
            while (--temp >= 0) {
                sum += arr[kp++];
            }
            if(sum/k >= threshold) counter++; 
            i++;
        }

        return counter;
    }
}