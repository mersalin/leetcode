class Solution {
public static int maximumNumberOfOnes(int width, int height, int sideLength, int maxOnes) {
    int nw = width / sideLength;
    int nh = height / sideLength;
    int rw = width % sideLength;
    int rh = height % sideLength;

    int m = Math.min(rw * rh, maxOnes);
    int output = nw * nh * maxOnes + m;

    
	int n = Math.min(nw, nh);
    int area = ((rw + rh) * sideLength - rw * rh);
    output += n * (Math.min(maxOnes, area) + m);

    if (nw > nh) {
      output += (nw-nh) * Math.min(maxOnes, rh * sideLength);
    } else if (nw < nh) {
      output += (nh-nw) * Math.min(maxOnes, rw * sideLength);
    }
    return output;
  }
}