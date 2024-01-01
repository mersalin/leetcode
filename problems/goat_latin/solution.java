class Solution {
    public String toGoatLatin(String S) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        String result = "";
        char append = 'a';
        int counter = 0;
        for(String word : S.split(" ")) {
            if(vowels.contains(Character.toLowerCase(word.charAt(0)))) {
                word = word + "ma";
            } else {
                word = word.length() > 1 ? word.substring(1, word.length()) + word.charAt(0) : word;
                word = word + "ma";
            }
            for(int j=0; j<=counter; j++) {
                word = word + append;
            }
            counter++;
            result = result + " " + word;
        }
        return result.trim();
    }
}