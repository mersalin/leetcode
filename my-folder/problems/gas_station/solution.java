class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for (int i = 0; i<n; i++) {
            int tank = 0;
            int counter = 0;
            for (int j = i; j<i+n; j++) {
                if (tank + gas[j%n] < cost[j%n]) {
                    break;
                } else {
                    tank = tank + gas[j%n] - cost[j%n];
                    counter++;
                }
                if (counter == n) {
                    return i;
                }
            }
        } 
        return -1;
    }
}