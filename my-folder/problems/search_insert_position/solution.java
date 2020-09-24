class Solution {
  public int searchInsert(int[] nums, int target) {
    int n = nums.length - 1;
    int high = n;
    int low = 0;
    while (high >= low) {
      int mid = low + (high - low) / 2;
      if (nums[mid] > target) {
        high = mid - 1;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        return mid;
      }
    }
    return low;
  }
}