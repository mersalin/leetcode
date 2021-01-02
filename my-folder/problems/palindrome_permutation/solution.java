class Solution {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] cs = s.toCharArray();
        for (char c : cs) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (Integer v : map.values()) {
            if (v % 2 != 0) {
                count += 1;
            }
        }
        return count <= 1;
    }
}