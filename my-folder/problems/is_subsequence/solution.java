class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        if (n == 0) {
            return true;
        }
        
        if (n > m) {
            return false;
        }
        
        int index = 0;
        for (int i=0; i<m && index < n; i++) {
            if (t.charAt(i) == s.charAt(index)) {
                index++;
            }
        }
        return index == n;
    }
}