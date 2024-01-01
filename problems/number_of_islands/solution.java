class Solution {
    public int numIslands(char[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;
        
        if (nr == 0) {
            return 0;
        }
        
        int islands = 0; 
        for (int r=0; r<nr; r++) {
            for (int c=0; c<nc; c++) {
                if (grid[r][c] == '1') {
                    islands++;
                    dsf(r,c,grid);
                }

            }
        }
        return islands;
    }
    
    private void dsf(int r, int c, char[][] grid) {
        if (r<0 || c<0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        dsf(r+1, c, grid);
        dsf(r, c+1, grid);
        dsf(r-1, c, grid);
        dsf(r, c-1, grid);
    }
}