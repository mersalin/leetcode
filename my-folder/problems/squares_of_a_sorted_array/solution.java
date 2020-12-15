class Solution {
	public int[] sortedSquares(int[] nums) {
		int N = nums.length;
		int[] sorted = new int[N];

		int left = 0;
		int right = N-1;
		int i = N-1;
		while(left <= right){
			if(Math.abs(nums[left]) < Math.abs(nums[right])){
				sorted[i--] = nums[right]*nums[right];
				right--;
			} else {
				sorted[i--] = nums[left]*nums[left];
				left++;
			}
		}        
		return sorted;
	}
}