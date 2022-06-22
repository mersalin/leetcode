class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        if (r * c != rows * cols) {
            return mat;
        }
        
        int row = 0;
        int col = 0;
        
        int[][] reshaped = new int[r][c];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                reshaped[row][col] = mat[i][j];
                
                col++;
                if (col == c) {
                    col = 0;
                    row ++;
                }
            }
        }
        return reshaped;
    }
}