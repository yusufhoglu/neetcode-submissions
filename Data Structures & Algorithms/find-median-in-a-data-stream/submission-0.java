class MedianFinder {

    PriorityQueue<Integer> small;
    PriorityQueue<Integer> large;
    public MedianFinder() {
        small = new PriorityQueue<Integer>(Collections.reverseOrder());
        large = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        small.add(num);
        if(!small.isEmpty() && !large.isEmpty() && small.peek() > large.peek()) {
            int largeNumber = small.poll();
            large.add(largeNumber);
        }

        if(small.size() > large.size() + 1) {
            int lastNumber = small.poll();
            large.add(lastNumber);
        } else if(large.size() > small.size() + 1) {
            int smallNumber = large.poll();
            small.add(smallNumber);
        }
    }
    
    public double findMedian() {
        if(small.size() > large.size()) {
            return (double) small.peek();
        } else if (large.size() > small.size()) {
            return (double) large.peek();
        }

        return (small.peek() + large.peek()) / 2.0;
    }
}
