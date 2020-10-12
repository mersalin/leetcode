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
    int maxWidth = 0;
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Map<Integer, Integer> leftWidth = new HashMap<>();
        findWidth(root, leftWidth, 0, 0);
        return maxWidth;
    }
    
    private void findWidth(TreeNode node,Map<Integer, Integer> map, int depth, int position) {
        if (node == null) {
            return;
        }
        map.computeIfAbsent(depth, x -> position);
        maxWidth = Math.max(maxWidth, position - map.get(depth) + 1);
        findWidth(node.left, map, depth + 1, 2 * position);
        findWidth(node.right, map, depth + 1, 2 * position + 1);   
    }
    
}