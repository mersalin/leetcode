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
class BSTIterator {

private Stack<TreeNode> stack; 
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        if (root != null) {
            stack.push(root);
            while (root.left != null) {
                root = root.left;
                stack.push(root);
            }
        }
    }
    
    public int next() {
        TreeNode node = stack.pop();
        int ret = node.val;
        node = node.right;
        if (node != null) {
            stack.push(node);
            while (node.left != null) {
                node = node.left;
                stack.push(node);
            }
        }
        return ret;
    }
    
    public boolean hasNext() {
        return stack.size() > 0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */