class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        for (int num : nums1) {
            countMap.computeIfPresent(num, (key, val) -> val + 1);
            countMap.computeIfAbsent(num, key -> 1);   
        }
        
        
        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                result.add(num);
                countMap.compute(num, (key, val) -> val -1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}