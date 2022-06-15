class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> visited = new HashSet<Integer>();
        
        for ( int num : nums) {
            if (visited.contains(num)) {
                return true;
            }
            visited.add(num);
        }
        return false;
    }
}