class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       Map<Integer, Integer> wanted = new HashMap<>();
        for (int i=0; i<nums.length; i++) { 
            int num = nums[i];
            int lookup = target - num;
            
            if (wanted.containsKey(lookup)) {
                return new int[]{wanted.get(lookup), i};
            }
            
            wanted.put(num, i);
        }
        return new int[]{};
        
    }
}