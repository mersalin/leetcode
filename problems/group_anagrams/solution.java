class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;        
        HashMap<String, Integer> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        int count = 0;
        
        for(int i=0;i<n;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String str = String.valueOf(chars);
            if(map.containsKey(str)){
                int l = map.get(str);
                list.get(l).add(strs[i]);
            }else{
                List<String> words = new ArrayList<>();
                words.add(strs[i]);
                list.add(words);
                map.put(str, count++);
            }
        }
        return list;
    }

}