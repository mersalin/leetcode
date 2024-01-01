class Solution {
public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        if (intervals == null || intervals.length == 0) return Collections.emptyList();
        
        List<List<Integer>> result = new ArrayList<>();
        if (toBeRemoved == null) {
            for (int[] interval : intervals)
                result.add(new ArrayList<>(Arrays.asList(interval[0], interval[1])));
            return result;
        }
        
        for (int[] interval : intervals) {
            
            if (interval[1] < toBeRemoved[0] || interval[0] > toBeRemoved[1])
                result.add(Arrays.asList(interval[0], interval[1]));
            
            else {
                // Find intersection
                if (interval[0] < toBeRemoved[0])
                    result.add(Arrays.asList(interval[0], toBeRemoved[0]));
            
                if (interval[1] > toBeRemoved[1])
                    result.add(Arrays.asList(toBeRemoved[1], interval[1]));
            }   
        }
        return result;
    }
}