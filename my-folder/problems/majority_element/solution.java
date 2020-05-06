class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> count = new HashMap(n);
        
        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if(entry.getValue() > n/2) {
                return entry.getKey();
            }
            
        }
        return -1;
    }
}