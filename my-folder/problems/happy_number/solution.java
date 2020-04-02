class Solution {
    
    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap();
        int squaredSum = n;
        int newSquaredSum = 0;
        
        while(squaredSum != 1) {
            newSquaredSum = calculateSquaredSum(squaredSum); 
            if(map.get(newSquaredSum) != null) {
                return false;
            } else {
                map.put(squaredSum, newSquaredSum);
            }
            squaredSum = newSquaredSum;
        }   
        return true;
    }
    
    public int calculateSquaredSum(int num) {
        int square = 0;
        while (num > 0) {
            square = square + (int)Math.pow((num % 10), 2);
            num = num / 10;
        }
        return square;
    }
}