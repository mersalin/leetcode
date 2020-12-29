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
private int dfs(TreeNode node, int path) {
    if(node == null) return 0;
    path ^= 1 << node.val;
    return node.left == null && node.right == null ? ((path & (path - 1)) == 0 ? 1 : 0) : dfs(node.left, path) + dfs(node.right, path);
}
public int pseudoPalindromicPaths(TreeNode root) {
    return dfs(root, 0);
}

}