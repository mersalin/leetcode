class Solution {
    public int[] sortArrayByParity(int[] A) {
        int start = 0;
        for (int i=0; i<A.length; i++) {
            if(A[i] % 2 == 0) {
                int temp = A[i];
                A[i] = A[start];
                A[start] = temp;
                start++;
            }
        }
        return A;
    }
}