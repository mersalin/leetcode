class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int n = A.length;
        int[] nums = new int[7];
        
        for (int i=0; i<n; i++) {
            if (A[i] != B[i]) {
                nums[A[i]]++;
                nums[B[i]]++;
            } else {
                nums[A[i]]++;
            }
        }
        
        int num = 0;
        for (int i=0; i<7; i++) {
            if (nums[i] == n) {
                num = i;
            }
        }
        
        if (num == 0) {
            return -1;
        }
        
        int occurranceInA = 0;
        for (int i=0; i<n; i++) {
            if (A[i] == num) {
                occurranceInA++;
            }
        }
        
        int occurranceInB = 0;
        for (int i=0; i<n; i++) {
            if (B[i] == num) {
                occurranceInB++;
            }
        }
        return n - Math.max(occurranceInA, occurranceInB);
    }
}