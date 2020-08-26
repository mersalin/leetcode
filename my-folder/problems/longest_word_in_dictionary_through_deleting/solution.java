class Solution {
    public String findLongestWord(String s, List<String> d) {
        int n = 0;
        String result = "";
        for (String word : d) {
            int x = 0;
            int y = 0;
            while (x < s.length() && y < word.length()) {
                if(s.charAt(x) == word.charAt(y)) {
                    x++;
                    y++;
                } else {
                    x++;
                }
            }
            if(y == word.length() && word.length() > n) {
                n = word.length();
                result = word;
            } else if(y == word.length() && n == word.length()) {
                result = result.compareTo(word) >= 0 ? word : result;
            }
        }
        return result;
    }
}