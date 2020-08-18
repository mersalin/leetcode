class Solution {
    public int[] numsSameConsecDiff(int N, int K) {
        List<Integer> list = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (int i=2; i<=N; i++) {
            List<Integer> list2 = new ArrayList<>();
            for (int val : list) {
                int e = val % 10;
                if (val > 0 && e + K < 10) {
                    list2.add((val * 10) + (e + K));
                }
                if (val > 0 && K > 0 && e - K >= 0) {
                    list2.add((val * 10) + (e - K));
                }
            }
            list = list2;
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}