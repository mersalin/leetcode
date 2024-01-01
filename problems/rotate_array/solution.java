class Solution {
    public void rotate(int[] nums, int k) {
        if (k == 0){
            return;
        }
        
        int n = nums.length;
        if (n == 0) {
            return;
        }
        reverse(nums, 0, n-1);
        reverse(nums, 0, (k%n)-1);
        reverse(nums, k%n, n-1);
    }
    
    
    private void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
}