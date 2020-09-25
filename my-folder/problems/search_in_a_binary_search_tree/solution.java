class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
      while (root != null) {
		if (val > root.val) {
			root = root.right;
} else if (val < root.val) {
	root = root.left;
} else {
	return root;
}
}
        return null;
    }
}
