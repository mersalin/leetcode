class Solution {
    public int maxPower(String s) {
        int n = s.length();
        
        if (n == 0) {
            return 0;
        }
        
        char prev = s.charAt(0);
        int max = 1;
        int curCount = 1;
        for (int i=1; i<n; i++) {
            if (s.charAt(i) == prev) {
                curCount++;
            } else {
                prev = s.charAt(i);
                curCount = 1;
            }
            max = Math.max(curCount, max);
        }
        return max;
    }
}