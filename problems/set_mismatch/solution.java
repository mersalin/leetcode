class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ref = new int[nums.length + 1];
        int[] result = new int[2]; 
        for (int num : nums) {
            ref[num]++;
        }
        
        for (int i=1; i<nums.length + 1; i++) {
            if (ref[i] == 0) {
                result[1] = i;
            } else if (ref[i] > 1) {
                result[0] = i;
            }
        }
        
        return result;
    }
}