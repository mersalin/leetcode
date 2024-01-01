class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root, 1);
    }
    
    private int helper(TreeNode node, int depth) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        
        if (node.right == null && node.left == null) {
            return depth;
        }
        
        int leftDepth =  helper(node.right, depth + 1);
        int rightDepth = helper(node.left, depth + 1);
        return Math.min(leftDepth, rightDepth);
    }
}