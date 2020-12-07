class Solution {
public int[][] generateMatrix(int n) {
        int num = 1;
        int ans[][] = new int[n][n];
        int round = 0, i, j; // round = 0  means first iteration around the matrix ie right, down, left, up.
        while(true)
        {
            i = round; j = round;
            // right
            while(j <= n-(round+1))
            {
                ans[i][j] = num;
                num++;
                j++;
            }
            
            i = round + 1; j = n - (round+1);
            // down
            while(i <= n-(round+1))
            {
                ans[i][j] = num;
                num++;
                i++;
            }
            
            i = n - (round + 1);
            j = n - (round + 2);
            // left
            while(j >= round)
            {
                ans[i][j] = num;
                num++;
                j--;
            }
            
            i = n - (round+2);
            j = round;
            // up
            while(i >= round+1)
            {
                ans[i][j] = num;
                num++;
                i--;
            }
            if (num > n*n) break;
            round++;
        }
        
        return ans;
    }
}