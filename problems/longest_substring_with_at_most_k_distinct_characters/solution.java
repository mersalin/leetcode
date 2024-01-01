class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0) return 0;
        Set<Character> currentSet = new HashSet<>();
        int[] letterCount = new int[127];
        int length = s.length();

        int maxSequenceLength = 0;
        int currentSequenceLength = 0;
        int start = 0;
        int current = 0;
        while (start < length && current < length) {
            char currentChar = s.charAt(current);
            if (currentSet.contains(currentChar)) {
                currentSequenceLength++;
                letterCount[currentChar]++;
                current++;
            } else {
                if (currentSet.size() < k) {
                    letterCount[currentChar]++;
                    currentSet.add(currentChar);
                    currentSequenceLength++;
                    current++;
                } else {
                    maxSequenceLength = Math.max(maxSequenceLength, currentSequenceLength);
                    while (currentSet.size() == k && start < current) {
                        char characterToRemove = s.charAt(start++);
                        currentSequenceLength--;
                        if (--letterCount[characterToRemove] == 0) {
                            currentSet.remove(characterToRemove);
                        }
                    }
                }
            }
        }
        return Math.max(maxSequenceLength, currentSequenceLength);
    }
}