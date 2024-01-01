class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0;i < pieces.length;i++) {
            map.put(pieces[i][0], i);
        }
        
        for(int i = 0;i < arr.length;) {
            if (map.containsKey(arr[i])) {
                int[] sub = pieces[map.get(arr[i])];
                //check if sub array confirms to a portion of main array
                
                for(int j = 0;j<sub.length;j++) {
                    if (sub[j] != arr[i++]) return false;
                }
                
                
            } else return false;
        }
        
        
        return true;
    }
}