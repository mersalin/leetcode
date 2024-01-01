class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        
        int row = grid.length;
        int col = grid[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        
        if (freshCount == 0) {
            return 0;
        }
        
        int count = 0;
        int[][] dirs = {{0,-1}, {0,1}, {-1,0}, {1,0}};
        while(!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i=0; i<size; i++) {
                int[] point = queue.poll();
                for (int[] dir : dirs) {
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];
                    System.out.println(x);
                    System.out.println(y);
                    if (x < 0 || y < 0 || x > row-1 || y > col-1 || grid[x][y] == 2 || grid[x][y] == 0) {
                        continue;
                    } else {
                        grid[x][y] = 2;
                        queue.offer(new int[]{x,y});
                        freshCount--;
                    }   
                }
            }
        }
        return freshCount == 0 ? count-1 : -1;
    }
}