class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
            return false; 
        }
        
        int[] nums = new int[n];
        Arrays.fill(nums, -1);
        
        for (int i=0; i<edges.length; i++) {
            int x = find(nums, edges[i][0]);
            int y = find(nums, edges[i][1]);
            
            if (x == y) {
                return false;
            }
            
            nums[x] = y;
        }
        return true;
    }
    
    private int find(int[] nums, int val) {
        if (nums[val] == -1) {
            return val;
        }
        return find(nums, nums[val]);
    }
}