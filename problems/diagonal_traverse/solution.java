class Solution {
public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[]{};
        
        int r = 0, c =0, row = matrix.length, col = matrix[0].length, index = 0;
        int[] result = new int[row*col];
        
            while(true){
                //Go Up
                while(r>=0 && c>=0 && r<row && c <col)
                    result[index++] =  matrix[r--][c++];
                
                r++;
                c--;

                if(r == row -1 && c == col-1) {
                    break;
                }
                 if(c < col-1) c++; else r++;
                //Go Down
                while(r>=0 && c>=0 && r<row && c <col)
                    result[index++] =  matrix[r++][c--];

                r--;
                c++;
                
                if(r == row -1 && c == col-1) {
                    break;
                }
                if(r<row-1) r++; else c++;
            }
        
        return result;
    }
}