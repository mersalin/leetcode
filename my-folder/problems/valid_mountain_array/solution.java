class Solution {
    public boolean validMountainArray(int[] arr) {
    int peak = 0, left = 0, right = 0;
    int size = arr.length;
    while ((peak < size - 1) && (arr[peak] < arr[peak + 1])) {
    peak ++;
    left ++;
    };
    while ((peak < size - 1) && (arr[peak] > arr[peak + 1])) {
    peak ++;
    right ++;
    };
    return (left * right > 0) && (peak == size - 1);

    }
}