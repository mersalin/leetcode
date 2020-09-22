class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        final List<Integer> result = new ArrayList<>();
        int m = nums.length / 3;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > m && !result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}