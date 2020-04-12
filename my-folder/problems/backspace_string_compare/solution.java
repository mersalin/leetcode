class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        Stack<Character> first = new Stack();
        Stack<Character> second = new Stack();
        
        for(int i=0; i < S.length(); i++) {
            if(S.charAt(i) == '#') {
               
                if(!first.empty())
                    first.pop();
            } else {
                first.push(S.charAt(i));
            }
        }
        
        for(int i=0; i < T.length(); i++) {
            if(T.charAt(i) == '#') {
                if(!second.empty())
                    second.pop();
            } else {
                second.push(T.charAt(i));
            }
        }
        
        String s1 = "";
        String s2 = "";
        
        while(!first.empty()) {
            s1 = s1 + first.pop(); 
        }
        
        while(!second.empty()) {
            s2 = s2 + second.pop(); 
        }
        return s1.equals(s2);
    }
}