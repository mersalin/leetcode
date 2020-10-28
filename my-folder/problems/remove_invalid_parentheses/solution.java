class Solution {
    public List<String> removeInvalidParentheses(String s) {
        if (s == null) {
            return new ArrayList<>();
        }
        
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(s);
        visited.add(s);
        boolean found = false;
        while (!queue.isEmpty()) {
            s = queue.poll();
    
            if (isValid(s)) {
                result.add(s);
                found = true;
            }
            
            if (found) {
                continue;
            }
            
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if (c != '(' && c != ')') {
                    continue;
                }
                String t = s.substring(0, i) + s.substring(i+1);
                if (!visited.contains(t)) {
                    queue.offer(t);
                    visited.add(t);
                }
                
            }
            
        }
        return result;
    }
    
    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        return count == 0;
    }
}