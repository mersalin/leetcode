class Solution {
    Integer prev = null;
    int max = 0;
    int count = 1;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        
        int[] modes = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            modes[i] = list.get(i);
        }
        
        return modes;
    }
    
    private void traverse(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        traverse(node.left, list);
        int val = node.val;
        if (prev != null) {
            if(prev == val) {
                count++;
            } else {
                count = 1;
            }
        }
        
        if (count > max) {
            max = count;
            list.clear();
            list.add(val);
        } else if (count == max) {
            list.add(val);
        }
        prev = val;
        traverse(node.right, list);
    }
}