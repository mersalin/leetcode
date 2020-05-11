class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image[sr][sc] == newColor) {
            return image;
        }
        
        floodFill(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }
    
    
    public void floodFill(int[][] image, int sr, int sc, int newColor, int startPixel) {
        if(sr - 1 >= 0 && image[sr-1][sc] == startPixel) {
            image[sr-1][sc] = newColor;
            floodFill(image, sr-1, sc, newColor, startPixel);
        }
        
        if(sr + 1 < image.length && image[sr+1][sc] == startPixel) {
            image[sr+1][sc] = newColor;
            floodFill(image, sr+1, sc, newColor, startPixel);
        }
        
        if(sc - 1 >= 0 && image[sr][sc-1] == startPixel) {
            image[sr][sc-1] = newColor;
            floodFill(image, sr, sc-1, newColor, startPixel);
        }
        
        if(sc + 1 < image[0].length && image[sr][sc+1] == startPixel) {
            image[sr][sc+1] = newColor;
            floodFill(image, sr, sc+1, newColor, startPixel);
        }
        image[sr][sc] = newColor;
    }
}