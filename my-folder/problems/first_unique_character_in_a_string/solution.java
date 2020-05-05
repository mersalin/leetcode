class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map<Character, Integer> countMap = new HashMap();
        
        for(char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < n; i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}