/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }
    
    private int sumOfLeftLeaves(TreeNode node, boolean isLeft) {
        if(node == null) {
            return 0;
        }
        
        if(node.left == null && node.right == null && isLeft) {
            ans = ans + node.val;
        }
        
        sumOfLeftLeaves(node.left, true);
        sumOfLeftLeaves(node.right, false);
        return ans;
    }
    
}