class Solution {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int k=0, m=0;
        for (int i=0, j=0; i< word1.length && j < word2.length;) {
            while (k< word1[i].length() && m < word2[j].length()) {
                if (word1[i].charAt(k) != word2[j].charAt(m)) {
                    return false;
                }
                k++; m++;
            }
            if ( k == word1[i].length()) {
                k = 0; i++;
            }
            if ( m == word2[j].length()) {
                m = 0; j++;
            }
        }
        if ( k !=0 || m !=0) {
            return false;
        }
        return true;
    }
}