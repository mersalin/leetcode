class Solution {
    public boolean buddyStrings(String A, String B) {
        int n = A.length();
        int m = B.length();
        
        if (n != m) {
            return false;
        }
        
        
        if (B.equals(A)) {
            Set<Character> letters = new HashSet<>();
            for (int i=0; i<n; i++){
                letters.add(A.charAt(i));
            }
            return letters.size() < m;
        } else {
            List<Integer> diff = new ArrayList<>();
            for (int i=0; i<n; i++){
                if(A.charAt(i) != B.charAt(i)) {
                    diff.add(i);
                }
            }
            return diff.size() == 2 
                && A.charAt(diff.get(0)) == B.charAt(diff.get(1))
                && A.charAt(diff.get(1)) == B.charAt(diff.get(0));
        }
    }
}