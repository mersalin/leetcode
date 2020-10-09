/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder tree = new StringBuilder("");
        if (root == null) {
            return tree.toString();
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    tree.append(node.val);
                } else {
                    tree.append("-");
                }
                if (node != null) {
                    queue.offer(node.left);
                }
                if (node != null) {
                    queue.offer(node.right);
                }
                tree.append(",");
            }
        }
        return tree.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        int n = values.length;
        if (n == 0) {
            return null;
        }
        
        TreeNode root = createNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        n--;
        int index = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                if (n > 0 && node != null) {
                    node.left = createNode(values[index++]);
                    queue.offer(node.left);
                    n--;
                }
                if (n > 0 && node != null) {
                    node.right = createNode(values[index++]);
                    queue.offer(node.right);
                    n--;
                }
                if (n <= 0) {
                    return root;
                }
            }
        }
        return root;
    }
    
    private TreeNode createNode(String val) {
        if ("-".equals(val) || "".equals(val)) {
            return null;
        }
        int x = Integer.parseInt(val);
        return new TreeNode(x);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;