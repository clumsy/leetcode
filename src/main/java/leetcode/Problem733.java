package leetcode;

public class Problem733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int fillColor = image[sr][sc];
        if (fillColor == newColor) {
            return image;
        }
        image[sr][sc] = newColor;

        // left
        if (sc > 0) {
            if (image[sr][sc - 1] == fillColor) {
                floodFill(image, sr, sc - 1, newColor);
            }
        }

        // up
        if (sr > 0) {
            if (image[sr - 1][sc] == fillColor) {
                floodFill(image, sr - 1, sc, newColor);
            }
        }

        // right
        if (sc < image[0].length - 1) {
            if (image[sr][sc + 1] == fillColor) {
                floodFill(image, sr, sc + 1, newColor);
            }
        }

        // down
        if (sr < image.length - 1) {
            if (image[sr + 1][sc] == fillColor) {
                floodFill(image, sr + 1, sc, newColor);
            }
        }
        return image;
    }
}
