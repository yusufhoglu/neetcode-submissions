class Solution {
    public int[][] merge(int[][] intervals) {
        // sort the key
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // add each element -merged or not- to my new result array
        int[][] mergedIntervals = new int[intervals.length][2];
        int index = 0;
    
        mergedIntervals[0] = intervals[0];
        // compare sorted intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] prev = mergedIntervals[index];
            int[] curr = intervals[i];
            // compare the second with new array -what if first 2 interval
            if (prev[1] >= curr[0]) {
                prev[1] = Math.max(prev[1],curr[1]);
             } else {
                mergedIntervals[++index] = curr;
            }   
        }

        // return new array
        return Arrays.copyOf(mergedIntervals, index + 1);   
    }   
}
