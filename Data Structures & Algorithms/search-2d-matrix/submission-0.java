class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int right_index = (matrix[0].length * matrix.length)-1;
        int column = matrix[0].length;
        int left_index = 0;

        while (left_index <= right_index) {
            int medium = left_index + (right_index-left_index)/2;
            int array_order = medium/column;
            int order = medium % column;
            int value = matrix[array_order][order];

            if(value > target) {
                right_index = medium - 1;
            } else if(value < target) {
                left_index = medium + 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
