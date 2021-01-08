class Solution {
    public int lengthOfLongestSubstring(String s) {
     if(s.length()==0){
         return 0;
     }   
       
        int len=s.length();
     int[] dp=new int[len];
        dp[0]=1;
        
        
      for(int i=1;i<len;i++){
          List<Character>list=new ArrayList<>();
          int j=i;
          
          while(j>=0 && !list.contains(s.charAt(j))){
              list.add(s.charAt(j));
              j--;
          }
          dp[i]=Math.max(dp[i-1],list.size());
          
      }  
        return dp[len-1];
    }
}