class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < manager.length; i++) {
            int mgr = manager[i];
            graph.putIfAbsent(mgr, new ArrayList<Integer>());
            graph.get(mgr).add(i);
        }
        return dfs(graph, informTime, headID);
    }
    
    private int dfs(Map<Integer, List<Integer>> graph, int[] informTime, int cur) {
        int max = 0;
        if (!graph.containsKey(cur)) {
            return max;
        }
        
        for (int i = 0; i < graph.get(cur).size(); i++) {
            max = Math.max(max, dfs(graph, informTime, graph.get(cur).get(i)));
        }
        return max + informTime[cur];
    }
}