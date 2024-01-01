class Solution {
	int pre = 0;
public TreeNode bstToGst(TreeNode root) {
		if (root.right != null) {
			bstToGst(root.right);
}
pre = pre + root.val;
root.val = pre;
if (root.left != null) {
	bstToGst(root.left);
}
	return root;
}
}


