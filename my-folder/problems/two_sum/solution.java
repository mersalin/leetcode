class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visited = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (visited.containsKey(x)) {
                return new int[]{visited.get(x), i};
            }
            visited.put(nums[i], i);
        }
        return new int[]{};
    }
}