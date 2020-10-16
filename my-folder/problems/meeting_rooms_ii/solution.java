class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        int[] starts = new int[n];
        int[] ends = new int[n];
        
        for (int i=0; i<n; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        
        Arrays.sort(starts);
        Arrays.sort(ends);
        
        int index = 0;
        int rooms = 0;
        
        for (int i=0; i<n; i++) {
            if (starts[i] < ends[index]) {
                rooms++;
            } else {
                index++;
            }
        }
        
        return rooms;
    }
}