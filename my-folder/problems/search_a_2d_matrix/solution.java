class Solution {
    public boolean searchMatrix(int[][] matrix, int target) { 
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        
        int n = matrix[0].length;
        
        int j = 0;
        int k = n - 1;
        while (j >= 0 && j < m && k >=0 && k < n) {
            int val = matrix[j][k];
            if (target > val) {
                j++;
            } else if (target < val) {
                k--;
            } else {
                return true;
            }
        } 
        return false;
    }
}