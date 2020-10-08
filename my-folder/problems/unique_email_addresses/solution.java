class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String name = email.substring(0, email.indexOf('@'));
            String domain = email.substring(email.indexOf('@'), email.length());
            name = name.contains("+") ? name.substring(0, name.indexOf("+")) : name;
            set.add(name.replace(".", "")+domain);
        }
        return set.size();
    }
}