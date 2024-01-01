class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
	int n = timeSeries.length;
     	if (n == 0) {
		return 0;
}

  int totalPoisonedDuration = duration;
	int prev = timeSeries[0];
	for (int i=1; i<n; i++) {
		if((timeSeries[i] - prev) >= duration) {
			totalPoisonedDuration += duration;
		} else {
			totalPoisonedDuration += (timeSeries[i] - prev);
		}
    prev = timeSeries[i];
  }
	return totalPoisonedDuration;
    }
}

