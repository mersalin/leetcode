class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> result = new LinkedList<>();
        
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int begin = 0, end = 0, counter = map.size();
        
        while(end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                
                if (map.get(c) == 0) {
                   counter--; 
                }
            }
            end++;
            
            while (counter == 0) {
                char tempc = s.charAt(begin); 
                
                if (map.containsKey(tempc)) {
                    map.put(tempc, map.get(tempc) + 1);
                    if (map.get(tempc) > 0){
                        counter++;
                    }
                }
                
                if (end - begin == p.length()) {
                    result.add(begin);
                }
                begin++;   
            }
            
        }
         return result;
    }
}