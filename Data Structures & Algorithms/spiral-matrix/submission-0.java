class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int up = 0, left = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
        List<Integer> arr = new ArrayList<>();

        while (left <= right && up <= bottom) {
            for (int i = left; i <= right; i++) {
                arr.add(matrix[up][i]);
            }
            up++;
            for (int i = up; i <= bottom; i++) {
                arr.add(matrix[i][right]);
            }
            right--;

            if (up <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= up; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}
