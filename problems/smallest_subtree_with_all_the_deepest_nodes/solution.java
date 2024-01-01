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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return getHeight(root).getKey();
    }

    private Pair<TreeNode, Integer> getHeight(TreeNode root) {
        if (root == null) {
            return new Pair<>(null, 0);
        }
        Pair<TreeNode, Integer> l = getHeight(root.left), r = getHeight(root.right);
        int leftHt = l.getValue(), rightHt = r.getValue();
        if (leftHt == rightHt) {
            return new Pair<>(root, 1 + leftHt);
        } else if (l.getValue() > r.getValue()) {
            return new Pair<>(l.getKey(), 1 + leftHt);
        } else {
            return new Pair<>(r.getKey(), 1 + rightHt);
        }
    }
}