class Solution {
    public void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }
        
        int rows = board.length;
        int cols = board[0].length;
        
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (board[0][j] == 'O') {
                    dsf(board, 0, j);
                }
                if (board[i][0] == 'O') {
                    dsf(board, i, 0);
                }
                if (board[rows - 1][j] == 'O') {
                    dsf(board, rows - 1 , j);
                }
                if (board[i][cols - 1] == 'O') {
                    dsf(board, i, cols - 1);
                }
            }
        } 
        
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (board[i][j] == 'X') {
                    continue;
                }
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    
    private void dsf(char[][] board, int row, int col) {
        int rows = board.length;
        int cols = board[0].length;
        if (row < 0 || col < 0 || row >= rows || col >= cols || board[row][col] != 'O') {
            return;
        }
        
        board[row][col] = '*';
        
        dsf(board, row + 1, col);
        dsf(board, row, col + 1);
        dsf(board, row - 1, col);
        dsf(board, row, col - 1);
    }
    
}