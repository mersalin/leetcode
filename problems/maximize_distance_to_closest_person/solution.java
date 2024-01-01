class Solution {
    public int maxDistToClosest(int[] seats) {
        int max = Integer.MIN_VALUE;
        int n = seats.length;
        for (int i=0; i<n; i++) {
            if (seats[i] == 0) {
                int left = i;
                int right = i;
                int cur = 0;
                while (left >= 0 && seats[left] == 0 && right < n && seats[right] == 0) {
                    if (i == 0) {
                        right++;
                        cur = right - i;
                    } else if(i == n-1) {
                        left--;
                        cur = i - left;
                    } else {
                        left--;
                        right++;
                        cur = Math.min(i - left, right - i);
                    }
                    max = Math.max(cur, max);
                }
            }
        }
        return max;
    }
}