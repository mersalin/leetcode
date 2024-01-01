class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        int numOdd = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() %2 == 0) {
                length = length + entry.getValue();
            } else {
                length = length + entry.getValue() - 1;
                numOdd++;
            }
        }
        return length + (numOdd > 0 ? 1 : 0);
    }

}