class Solution {
    public int maxDepth(TreeNode root) {
if (root == null) {
return 0;
}

int rightDepth = maxDepth(root.right) + 1;
int leftDepth = maxDepth(root.left) + 1;
int max = Math.max(rightDepth, leftDepth);
return max;   
    }
}
