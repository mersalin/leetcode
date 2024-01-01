class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String cpdomain : cpdomains) {
            int count = Integer.parseInt(cpdomain.split(" ")[0]);
            String domain = cpdomain.split(" ")[1];
            String[] subDomains = domain.split("\\.");
            String dom = "";
            for (int i=subDomains.length - 1; i >= 0; i--) {
                dom = dom.length() >0 ? subDomains[i] + "." + dom : subDomains[i] + dom;
                map.put(dom, map.getOrDefault(dom, 0) + count);
            }
        }
        
        
        List<String> result = new ArrayList<>();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        return result;
    }
}