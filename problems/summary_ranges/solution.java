class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;  
        if (n == 0) {
            return new ArrayList<>();
        }
        
        List<String> result = new ArrayList<>();
        int startIndex = 0;
        int endIndex = 0;
        for (int i=0; i<n; i++) {
            if (i == 0) {
                continue;
            }
            
            if (nums[i] == nums[i-1] + 1) {
                endIndex++;
            } else if (startIndex == endIndex) {
                result.add(nums[startIndex] + "");
                startIndex = endIndex+1;
                endIndex++;
            } else {
                result.add(nums[startIndex] + "->" + nums[endIndex]);
                startIndex = endIndex+1;
                endIndex++;
            }
        }
        
        if (startIndex == endIndex) {
            result.add(nums[startIndex] + "");
        } else {
            result.add(nums[startIndex] + "->" + nums[endIndex]);
        }
        
        return result;
    }
}