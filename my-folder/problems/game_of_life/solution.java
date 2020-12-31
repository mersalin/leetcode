class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        List<int[]> changes = new ArrayList<>();
        for(int r = 0 ; r < m ; r++) {
            for(int c = 0 ; c < n ; c++) {
                int neighbors = 0;
                for(int y = Math.max(0, r - 1) ; y <= Math.min(m - 1, r + 1) ; y++) {
                    for(int x = Math.max(0, c - 1) ; x <= Math.min(n - 1, c + 1) ; x++) {
                        if (board[y][x] == 1 && (y != r || x != c)) {
                            neighbors++;
                        }
                    }
                }
                if ((board[r][c] == 1 && (neighbors < 2 || neighbors > 3))
                    || (board[r][c] == 0 && neighbors == 3)
                   ) {
                    changes.add(new int[] {r, c});
                }
            }
        }
        
        for(int[] change: changes) {
            int y = change[0];
            int x = change[1];
            board[y][x] = 1 - board[y][x];
        }
    }
}