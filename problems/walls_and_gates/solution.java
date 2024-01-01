class Solution {
    public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0) {
            return;
        }
        
        int row = rooms.length;
        int col = rooms[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (rooms[i][j] == 0) {
                    queue.offer(new int[]{i,j});
                }
            }
        }
        
        if (queue.size() == 0) {
            return;
        }
        
        
        int[][] dirs = {{0,-1}, {0,1}, {-1,0}, {1,0}};
        int wall = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i=0; i<n; i++) {
                int[] point = queue.poll();
                int distance = rooms[point[0]][point[1]];
                for (int[] dir : dirs) {
                    int x = point[0] - dir[0];
                    int y = point[1] - dir[1];
                    
                    if (x < 0 || y < 0 || x > row - 1 || y > col - 1 || rooms[x][y] == -1) {
                        continue;
                    } else if (rooms[x][y] == wall) {
                        rooms[x][y] = distance + 1;
                        queue.offer(new int[] {x,y});
                    } 
                }
            } 
        }
    }
}