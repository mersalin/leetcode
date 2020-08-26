class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        boolean[] travelDays = new boolean[366];
        
        for (int day : days) {
            travelDays[day] = true;
        }
        
        int[] minCost = new int[366];
        minCost[0] = 0;
        for (int day=1; day<366; day++) {
            if (!travelDays[day]) {
                minCost[day] = minCost[day-1];
                continue;
            }
            
            int min = 0;
            min = minCost[day - 1] + costs[0];
            min = Math.min(min,  minCost[Math.max(0, day-7)] + costs[1]);
            min = Math.min(min,  minCost[Math.max(0, day-30)] + costs[2]);
            minCost[day] = min;
        }
        return minCost[365];
    }
}