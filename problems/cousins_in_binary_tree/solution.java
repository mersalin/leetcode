class Solution {
  public boolean isCousins(TreeNode root, int x, int y) {
    if (root == null) {
      return false;
    }

    Queue <TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      boolean xFound = false;
      boolean yFound = false;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode cur = queue.poll();
        TreeNode right = cur.right;
        TreeNode left = cur.left;

        if (cur.val == x) {
          xFound = true;
        }

        if (cur.val == y) {
          yFound = true;
        }

        if (left != null && right != null) {
          if (left.val == x && right.val == y) {
            return false;
          }
          if (left.val == y && right.val == x) {
            return false;
          }
        }
        if (right != null) {
          queue.offer(right);
        }
        if (left != null) {
          queue.offer(left);
        }
      }
      if (xFound && yFound) {
        return true;
      }
    }
    return false;
  }
}