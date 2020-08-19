class Solution {
    public boolean detectCapitalUse(String word) {
        int numCapital = 0;
        
        for (int i=0; i<word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                numCapital++;
            }
        }
        System.out.println(numCapital);
        int l = word.length();
        return numCapital == l || (Character.isUpperCase(word.charAt(0)) && 1 == numCapital)
            || numCapital == 0;
        
    }
}