class Solution {
    
    Set<String> set = new HashSet<>();
    public int numTilePossibilities(String tiles) {
        numTilePossibilities(tiles, "");
        return set.size();
    }
    
    private void numTilePossibilities(String s, String ans) {
        if(ans.length() != 0) {
            set.add(ans);
        }
        
        for(int i = 0; i < s.length(); i++){         
            numTilePossibilities(s.substring(0, i) + s.substring(i+1), ans + s.charAt(i));      
        }
    }
    
}