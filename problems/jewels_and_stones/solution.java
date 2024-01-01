class Solution {
    public int numJewelsInStones(String J, String S) {
	
	Map<Character, Integer> map = new HashMap<>();

	for (char c : S.toCharArray()) {
		map.put(c, map.getOrDefault(c, 0) + 1);
}

int jewelCount = 0;
for (char c : J.toCharArray()) {
	jewelCount = jewelCount + map.getOrDefault(c, 0);
}
        return jewelCount;
    }
}
