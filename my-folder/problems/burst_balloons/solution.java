class Solution {
    public int maxCoins(int[] nums) {
        if (nums.length == 0) return 0;
        
        int n = nums.length + 2;
        int[] arr = new int[n];
        int[][] dp = new int[n][n];
        
        arr[0] = 1;
        arr[n - 1] = 1;
        
        for (int i = 1; i < n - 1; i++) arr[i] = nums[i - 1];
        
        for (int window = 1; window < n - 1; window++) {
            for (int left = 1; left < n - window; left++) {
                int right = left + window - 1;
                
                for (int i = left; i <= right; i++) {
                    dp[left][right] = Math.max(dp[left][right], dp[left][i - 1] + arr[left - 1] * arr[i] * arr[right + 1] + dp[i + 1][right]);
                }
            }
        }
        
        return dp[1][nums.length];
    }
}