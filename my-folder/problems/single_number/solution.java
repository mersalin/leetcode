class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int index = 0;
        while(index < n) {
            int val = nums[index];
            if (index == n-1) {
                return nums[index];
            }else if (val == nums[index+1]) {
                index += 2;
            } else {
                return val;
            }
        }
        return nums[0];
    }
}