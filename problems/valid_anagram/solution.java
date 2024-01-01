class Solution {
    public boolean isAnagram(String s, String t) {
      
      int[] letters = new int[26];
      
      for (char c : s.toCharArray()) {
        letters[c - 'a']++;
      }
      
      for (char c : t.toCharArray()) {
        letters[c - 'a']--;
      }
      
      for (int i : letters) {
        if (i>0 || i <0) {
          return false;
        }
      }
        return true;
    }
}