
class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
          return 0;
        }
      
        int nodes = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
          TreeNode node = queue.poll();
          if (node != null) {
            nodes++;
            queue.offer(node.right);
            queue.offer(node.left);
          }
        }
      return nodes;
    }
}