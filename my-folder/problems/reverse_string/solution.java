class Solution {
	public void reverseString(char[] s) {
		int n = s.length;
		if (n == 0 || n == 1) {
	return;
}

for (int i=0; i<n/2; i++) {
	char c = s[i];
	char temp = s[n-i-1];
	s[n-i-1] = s[i];
	s[i] = temp;
}
}
}
