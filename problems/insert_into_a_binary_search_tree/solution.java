class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val, null, null);
        }
        
        TreeNode parent = root;
        TreeNode node = root;
        while(node != null) {
            parent = node;
            if (val > node.val) {
                node = node.right;
            } else if (val < node.val) {
                node = node.left;
            }
        }
        TreeNode leaf = new TreeNode(val, null, null);
        if(val > parent.val) {
            parent.right = leaf;
        } else {
            parent.left = leaf;
        }
        return root;
    }
}