class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
int r = ransomNote.length();
	int m = magazine.length();

	if (r > m) {
		return false;
	}

	int[] letters = new int[26];

	for (int i=0; i<m; i++) {
		letters[magazine.charAt(i) - 'a']++;
	}

	for (int i=0; i<r; i++) {
		letters[ransomNote.charAt(i) - 'a']--;
		if(letters[ransomNote.charAt(i) - 'a'] < 0) {
			return false;
		}
	}
	return true;
    }
}
