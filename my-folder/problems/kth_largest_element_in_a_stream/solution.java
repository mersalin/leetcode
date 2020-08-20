class KthLargest {
    
    int k;
    final Queue<Integer> q;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.q = new PriorityQueue<>(k);
        
        for (int n : nums) {
            add(n);
        }
        
    }
    
    public int add(int val) {
        if(q.size() < k) {
            q.add(val);
        } else if(q.peek() < val) {
            q.poll();
            q.add(val);
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */