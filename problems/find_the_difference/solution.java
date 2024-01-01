class Solution {
    public char findTheDifference(String s, String t) {
       int[] letters = new int[26];
        
        for (char c : t.toCharArray()) {
            letters[c - '0' - 49]++;
        }
        for (char c : s.toCharArray()) {
            letters[c - '0' - 49]--;
        }
        
        for (int i=0; i<letters.length; i++) {
            if (letters[i] > 0) {
                return (char) (i + 49 + '0');
            }
        }
        
        return ' ';
    }
}