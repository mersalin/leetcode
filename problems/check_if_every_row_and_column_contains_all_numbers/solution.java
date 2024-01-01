class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!seen.add("seen " + matrix[i][j] + "in row " + i) ||
                    !seen.add("seen " + matrix[i][j] + "in col " + j)) {
                    return false;
                }
            }
        }
        return true;
    }
}