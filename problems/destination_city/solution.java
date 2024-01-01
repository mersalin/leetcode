class Solution {
    public String destCity(List<List<String>> paths) {
        
        Set<String> startPaths = new HashSet();
        
        for(List<String> path : paths) {
            startPaths.add(path.get(0));
        }
        
        for(List<String> path : paths) {
            if(!startPaths.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return null;
    }
}