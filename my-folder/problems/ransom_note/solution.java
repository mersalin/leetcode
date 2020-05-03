class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if (magazine.length() < ransomNote.length()) return false;
        
        int[] chars = new int[26];
        
        for(int i=0; i<magazine.length(); i++) {
            chars[magazine.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<ransomNote.length(); i++) {
            if(--chars[ransomNote.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        
        
        return true;
        
    }
}