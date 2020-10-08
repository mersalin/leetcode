class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();   
            for (int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                TreeNode left = node.left;
                node.left = node.right;
                node.right = left;
                
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if(node.left != null) {
                    queue.offer(node.left);
                }
            }
        }
        return root;
    }
}