class Solution {
  public boolean checkStraightLine(int[][] coordinates) {
    int x1 = coordinates[0][0];
    int y1 = coordinates[0][1];
    int x2 = coordinates[1][0];
    int y2 = coordinates[1][1];

    int dx = (x2 - x1);
    int dy = (y2 - y1);

    int n = coordinates.length;
    for (int i = 1; i < n; i++) {
      int x = coordinates[i][0];
      int y = coordinates[i][1];

      if (dy * (x - x1) != dx * (y - y1)) {
        return false;
      }
    }
    return true;
  }
}