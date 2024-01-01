class Solution {
  public List < List < Integer >> levelOrder(TreeNode root) {
    List < List < Integer >> ans = new ArrayList < >();

    if (root == null) {
      return ans;
    }

    Queue < TreeNode > queue = new LinkedList < >();
    queue.offer(root);

    while (!queue.isEmpty()) {
      int size = queue.size();
      List < Integer > list = new ArrayList < >();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (node != null) {
          list.add(node.val);
          queue.offer(node.left);
          queue.offer(node.right);
        }
      }
      if (list.size() > 0) {
        ans.add(list);
      }
    }
    return ans;
  }
}