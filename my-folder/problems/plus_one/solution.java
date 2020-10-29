class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        reverse(digits);
        
        int carry = 0;
        int index = 0;
        for (int digit : digits) {
            
            if (index == 0) {
                digit++;
            }
            
            if (carry > 0) {
                digit = digit + carry;
                carry = 0;
            }
            if (digit > 9) {
                carry = 1;
                digit = 0;
            }
            result.add(digit);
            index++;
        }
        
        if (carry > 0) {
            result.add(carry);
        }
        
        Collections.reverse(result);
        return result.stream().mapToInt(i->i).toArray();
    }
    
    private void reverse(int[] array) {
        for (int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}