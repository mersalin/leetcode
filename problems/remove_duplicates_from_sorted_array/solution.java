class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int n = 1;
        int prev = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (prev != nums[i]) {
                nums[n] = nums[i];
                prev = nums[i];
                n++;
            }
        }
        return n;
    }
}