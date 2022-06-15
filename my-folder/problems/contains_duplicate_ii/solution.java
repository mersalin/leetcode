class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> visited = new HashMap<>();
        
        for (int i = 0; i<nums.length; i++) {
            if (visited.get(nums[i]) != null && Math.abs(i - visited.get(nums[i])) <= k) {
                return true;
            }
            visited.put(nums[i], i);
        }
        return false;
    }
}