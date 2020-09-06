class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        dfs(root1, list);
        dfs(root2, list);
        Collections.sort(list);
        return list;
    }
    
    public static void dfs(TreeNode root, List<Integer> l){
        if(root == null) return;
        dfs(root.left, l);
        l.add(root.val);
        dfs(root.right, l);
        return;
    }
}