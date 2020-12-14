class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> out = new ArrayList<>();
        dfs(1, String.valueOf(s.charAt(0)), s, out, new LinkedList<>());
        return out;
    }

    private boolean isPalindrome(String str) {
        if (str.isEmpty()) return true;
        int i = 0, j = str.length() - 1;
        while (i <= j) if (str.charAt(i++) != str.charAt(j--)) return false;
        return true;
    }

    private void dfs(int index, String auxilaryStr, String str, List<List<String>> out, LinkedList<String> ls) {

        if (index == str.length()) {
            if (isPalindrome(auxilaryStr)) {
                ls.add(auxilaryStr);
                out.add(new ArrayList<>(ls));
                ls.removeLast();
            }
            return;
        }

        if (isPalindrome(auxilaryStr)) {
            ls.add(auxilaryStr);
            dfs(index + 1, String.valueOf(str.charAt(index)), str, out, ls);
            ls.removeLast();
        }
        dfs(index + 1, auxilaryStr + str.charAt(index), str, out, ls);
    }
}