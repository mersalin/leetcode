class Solution {
    public int distributeCandies(int[] candyType) {
        int totalCandies = candyType.length;
        Set<Integer> candyTypes = new HashSet<>();
        for (int type : candyType) {
            candyTypes.add(type);
        }
        
        int uniqueCandies = candyTypes.size();
        int eatableCandies = totalCandies/2;
        
        return uniqueCandies < eatableCandies ? uniqueCandies : eatableCandies;
    }
}