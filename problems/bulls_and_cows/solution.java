class Solution {
    public String getHint(String secret, String guess) {
        
        int n = secret.length();
        int[] digits = new int[10];
        int bulls = 0;
        int cows = 0;
        
        for (int i=0; i<n; i++) {
            digits[secret.charAt(i) - '0']++;
        }
    
        for (int i =0; i<n; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                digits[secret.charAt(i) - '0']--;
                bulls++;
            }
        }
        
        for (int i =0; i<n; i++) {
            if(secret.charAt(i) != guess.charAt(i) && secret.indexOf(guess.charAt(i)) >= 0 && digits[guess.charAt(i) - '0'] > 0) { 
                digits[guess.charAt(i) - '0']--;
                cows++;
            }
        }
        
        return bulls + "A" + cows + "B";
    }
}