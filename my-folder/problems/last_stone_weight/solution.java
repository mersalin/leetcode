class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> y - x);
        
        for(int a : stones) {
            queue.offer(a);
        }
        
        while(queue.size() > 1) {
            queue.offer(queue.poll() - queue.poll());
        }
        return queue.poll();
    }
}