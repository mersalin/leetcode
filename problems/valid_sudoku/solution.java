class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> seen = new HashSet<>();
        
        int n = board.length;
        int m = board[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                
                char number = board[i][j];
                
                if (!seen.add("seen " + number + "in row " + i) || 
                    !seen.add("seen " + number + "in col " + j) || 
                    !seen.add("seen " + number + "in board " + i/3 + j/3)) {
                    return false;
                }    
            }
        }

        return true;
    }
}