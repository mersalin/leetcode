class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        return match(s1, s2) || match(s2, s1);
    }
    
    private boolean match(String s1, String s2) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        
        for (int i=0; i< s1.length(); i++) {
            list1.add(s1.charAt(i));
            list2.add(s2.charAt(i));
        }
        Collections.sort(list1);
        Collections.sort(list2);     
        
        for (int i=0; i<list1.size(); i++) {
            if (list1.get(i) < list2.get(i) ) {
                return false;
            }
        }
        return true;
    }
}