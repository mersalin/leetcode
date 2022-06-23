class Solution {
    public int firstUniqChar(String s) {
        int[] alpha = new int[26];
        
        int index = 0;
        
        for (char c : s.toCharArray()) {
            index = c - 'a';
            alpha[index] = alpha[index] + 1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            index = c - 'a';
            if(alpha[index] == 1) {
                return i;
            }
        }
        return -1;
    }
}