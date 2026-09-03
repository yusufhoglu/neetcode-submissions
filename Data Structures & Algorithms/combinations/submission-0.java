class Solution {
    int[] numArr;
    
    int n;
    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        List<List<Integer>> combineList = new ArrayList<List<Integer>>();
        List<Integer> tmpArr = new ArrayList<Integer>();
        numArr = new int[n];
        for(int i = 0; i < n; i++) {
            numArr[i] = i + 1;
        };

        backtraceForCombine(0, k, tmpArr, combineList);
        return combineList;
    }

    public void backtraceForCombine(int index, int k, List<Integer> tmp, List<List<Integer>> combineList) {
        if (tmp.size() == k) {
            combineList.add(new ArrayList<>(tmp));
            return;
        }
        if (index >= numArr.length) {
            return;
        }

        tmp.add(numArr[index]);
        backtraceForCombine(index + 1, k, tmp, combineList);
        tmp.remove(tmp.size() - 1);

        backtraceForCombine(index + 1, k, tmp, combineList);
    }
}