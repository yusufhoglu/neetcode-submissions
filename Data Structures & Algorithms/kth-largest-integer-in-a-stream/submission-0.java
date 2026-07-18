class KthLargest {

    ArrayList<Integer> list = new ArrayList<>();
    int k;
    public KthLargest(int k, int[] nums) {
        for(int n: nums) {
            list.add(n);
        }
        this.k = k;
    }
    
    public int add(int val) {
        list.add(val);
        list.sort(null);
        return list.get(list.size() - k);
    }
}
