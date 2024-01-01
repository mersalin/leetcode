class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<>(k);
        
        for (int n : nums) {
            if (q.size() < k) {
                q.add(n);
            } else if(q.peek() < n) {
                q.poll();
                q.add(n);
            }
        }
        return q.peek();
    }
}