class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if (n==0) {
            return 0;
        }
        
        Arrays.sort(points, (a,b) -> a[1] - b[1]);
        
        int point = points[0][1];
        int count = 1;
        
        for (int i=1; i<n; i++) {
            int start = points[i][0];
            int end = points[i][1];
            if (point >= start && point <=end) {
                continue;
            } else {
                point = end;
                count++;
            }
        }
        return count;
    }
}