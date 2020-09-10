class Solution {
    public String getHint(String secret, String guess) {
        Map<Character, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i=0; i<secret.length(); i++) {
            char c = secret.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(int i=0; i<secret.length(); i++) {
            if( secret.charAt(i) == guess.charAt(i)) {
                result[0]++;
                if(map.get(guess.charAt(i)) <= 0) {
                    result[1]--;
                }
                 map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
            } else {
                if (map.get(guess.charAt(i)) != null && map.get(guess.charAt(i)) > 0) {
                    result[1]++;
                    map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
                }
            }
        }
        return result[0]+"A"+result[1] + "B";
    }
}