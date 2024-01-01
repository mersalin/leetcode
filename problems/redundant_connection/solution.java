class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        int[] result = null;
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
           
            if(dsf(u, v, 0, graph)) {
                result = edge;
            } else {
                graph.putIfAbsent(u, new ArrayList<Integer>());
                graph.get(u).add(v);

                graph.putIfAbsent(v, new ArrayList<Integer>());
                graph.get(v).add(u);
            }
            
        }
        return result;
    }
    
    private boolean dsf(int u, int v, int parent, Map<Integer, List<Integer>> graph) {     
        if (u == v) {
            return true;
        }
        
        if (graph.get(u) != null) {
            for (int child : graph.get(u)) {
                if (child == parent) {
                    continue;
                }
                boolean ret = dsf(child, v, u, graph);
                if (ret) {
                    return true;
                }
            }
        }
        return false;
    }
    
}