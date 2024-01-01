class Solution {
    public int findJudge(int N, int[][] trust) {
        
        if(N == 1) {
            return N;
        }
        
        Map<Integer, Set<Integer>> trusted = new HashMap();
        int judge = -1;
        int judgeCount = 0;
        
        
        for (int[] arr : trust ) {
            if(trusted.get(arr[0]) == null) {
                Set<Integer> set = new HashSet();
                set.add(arr[1]);
                trusted.put(arr[0], set);
            } else {
                Set<Integer> set = trusted.get(arr[0]);
                set.add(arr[1]);
                trusted.put(arr[0], set);
            }
        }
            
        for (int[] arr : trust ) {
            if(!trusted.keySet().contains(arr[1]) && judge != arr[1]) {
                judge = arr[1];
                
                if(++judgeCount > 1) {
                    return -1;
                }
                
                for(Map.Entry<Integer, Set<Integer>> entry : trusted.entrySet()) {
                    if(!entry.getValue().contains(judge)) {
                        return -1;
                    }
                }
            }
        }
        return judge;
    }
}