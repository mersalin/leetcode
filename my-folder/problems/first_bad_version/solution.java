public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      int low = 1;
      int high = n;
      int answer = -1;
      while (low <= high) {
        int mid = low + (high - low) / 2;
        if(isBadVersion(mid)) {
          high = mid - 1;
          answer = mid;
        } else {
          low = mid + 1;
        }
      }
        return answer;
    }
}