class Solution {
    public boolean checkIfExist(int[] arr) {
        int zeroCount = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if(i == 0) {
                zeroCount++;
            } else if(i % 2 == 0) {
                set.add(i);
            }
        }
        
        for (int i : arr) {
            if (i != 0 && set.contains(i*2)) {
                return true;
            }
        }
        return zeroCount > 1 ? true : false;
    }
}