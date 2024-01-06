class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length-3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length-2; j++) {
                if ( j > i +1 && nums[j] == nums[j - 1])
                    continue;
                int left = j + 1;
                int right = nums.length - 1;
                while(left < right) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[left];
                    sum += nums[right];

                    if (sum == target) {
                        List<Integer> quads = new ArrayList<>();
                        quads.add(nums[i]);
                        quads.add(nums[j]);
                        quads.add(nums[left]);
                        quads.add(nums[right]);
                        if (!result.contains(quads))
                            result.add(quads);

                        while (left < right && nums[left] == nums[left+1])
                            left++;

                        while (left < right && nums[right] == nums[right-1])
                            right--;

                        left++;
                        right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}