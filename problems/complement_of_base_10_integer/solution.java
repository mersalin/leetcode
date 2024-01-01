class Solution {
    public int bitwiseComplement(int N) {
      int exp = 1;
      while (exp < N)
        exp = exp << 1 | 1;
      return exp ^ N;
    }
}