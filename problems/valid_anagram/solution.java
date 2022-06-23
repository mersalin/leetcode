class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        if (n != m)  {
            return false;
        }
        
        int[] letters = new int[26];
        
        for (int i = 0; i < n; i++) {
            letters[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < m; i++) {
            letters[t.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < 26; i++) {
            if (letters[i] > 0 || letters[i] < 0) {
                return false;
            }
        }
        return true;
    }
}