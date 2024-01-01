class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ']') {
                StringBuilder temp = new StringBuilder();
                while(!stack.isEmpty() && stack.peek() != '[') {
                    temp.append(stack.pop() + "");
                }
                stack.pop();
                StringBuilder rep = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    rep.append(stack.pop());
                }
                int repeat = Integer.parseInt(rep.reverse().toString());
                String str = temp.toString();
                for (int i=0; i<repeat; i++) {
                    for (int j=str.length()-1; j>=0; j--) {
                        stack.push(str.charAt(j));
                    }
                }
            } else {
                stack.push(c);
            }
        }
        while(!stack.isEmpty()) {
            result.append(stack.pop() + "");
        }
        return result.reverse().toString();
    }
}