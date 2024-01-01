class Solution {
    public int twoCitySchedCost(int[][] costs) {
	int[] refund = new int[costs.length];
	int minCost = 0; int index = 0;
	for (int[] cost : costs) {
		minCost = minCost + cost[0];
		refund[index++] = cost[1] - cost[0];
}
Arrays.sort(refund);

for ( int i = 0; i< costs.length/2; i++) {

	minCost = minCost + refund[i];
}
return minCost;

    }
}
