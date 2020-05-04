class Solution {
    public int findComplement(int num) {
        int remaining = num;
        int bit = 1;
        
        while(remaining != 0) {
            num = num ^ bit;
            bit = bit << 1;
            remaining = remaining >> 1;
        }
        return num;
    }
}