class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        return s.trim().length() == 0 ? 0 : arr[arr.length - 1].length();
    }
}