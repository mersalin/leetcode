class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return nums;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<n; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}