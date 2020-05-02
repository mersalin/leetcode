class Solution {
    public int numJewelsInStones(String J, String S) {
        
        Set<Character> jewelChars = new HashSet(J.length());
        
         for(int i = 0; i < J.length(); i++) {
             jewelChars.add(J.charAt(i));
         }
        
        
        int jewels = 0;
        
        for(int i = 0; i < S.length(); i++) {
            if(jewelChars.contains(S.charAt(i))) {
                jewels++;
            }  
        }
        return jewels;
        
    }
}