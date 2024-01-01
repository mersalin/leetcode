class Solution {
    public int minCostToMoveChips(int[] position) {
        int[] cnt = new int[2];
        for (int pos : position)
            ++cnt[pos % 2];
        return Math.min(cnt[0], cnt[1]);
    }
}