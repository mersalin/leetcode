class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String s = S.replace("-", "");
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        int counter = 0;
        for (int i=n-1 ; i>=0; i--) {
            char c = s.charAt(i);
            if( c != '-') {
                stack.push(Character.toUpperCase(c));
                counter++;
                if(counter % K == 0 && i != 0 ) {
                    stack.push('-');
                }
            }
        }
        
        StringBuilder result = new StringBuilder("");
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}