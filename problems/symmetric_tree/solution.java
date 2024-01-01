class Solution {
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }

    Queue < TreeNode > queue = new LinkedList < >();
    if (root.right != null && root.left != null) {
      queue.offer(root.left);
      queue.offer(root.right);
    } else if (root.left == null && root.right == null) {
      return true;
    } else {
      return false;
    }

    while (!queue.isEmpty()) {
      int n = queue.size();
      if (n % 2 != 0) {
        return false;
      }
      Queue < TreeNode > q = new LinkedList < >();
      Stack < TreeNode > stack = new Stack < >();
      for (int i = 0; i < n / 2; i++) {
        TreeNode tNode = queue.poll();
        q.offer(tNode);
        insert(queue, tNode);
      }
      for (int i = n / 2; i < n; i++) {
        TreeNode tNode = queue.poll();
        stack.push(tNode);
        insert(queue, tNode);
      }

      for (int i = 0; i < n / 2; i++) {
        TreeNode n1 = q.poll();
        TreeNode n2 = stack.pop();
        if (n1 == null && n2 != null) {
            return false;
        } else if (n2 == null && n1 != null) {
          return false;
        } else if (n1 == null && n2 == null) {
          continue;
        } else if (n1.val != n2.val) {
          return false;
        }
      }
    }
    return true;
  }

  private void insert(Queue < TreeNode > q, TreeNode node) {
    if (node != null) {
      q.offer(node.right);
      q.offer(node.left);
    }
  }
}