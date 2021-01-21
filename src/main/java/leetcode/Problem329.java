package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem329 {
    public int longestIncreasingPath(int[][] matrix) {
        int maxLength = 0;
        Map<Integer, Integer> maxLengthCache = new HashMap<>();
        for (int row = 0, rows = matrix.length; row < rows; row++) {
            for (int col = 0, cols = matrix[0].length; col < cols; col++) {
                maxLength = Math.max(maxLength, getMaxLength(matrix, row, col, maxLengthCache));
            }
        }
        return maxLength;
    }

    private int getMaxLength(int[][] matrix, int row, int col, Map<Integer, Integer> maxLengthCache) {
        int cols = matrix[0].length;
        int cacheIndex = row * cols + col;
        Integer cached = maxLengthCache.get(cacheIndex);
        if (cached != null) {
            return cached;
        }
        int rows = matrix.length;
        int value = matrix[row][col];
        int max = 1;
        if (row > 0 && matrix[row - 1][col] > value) {
            max = Math.max(max, 1 + getMaxLength(matrix, row - 1, col, maxLengthCache));
        }
        if (row < rows - 1 && matrix[row + 1][col] > value) {
            max = Math.max(max, 1 + getMaxLength(matrix, row + 1, col, maxLengthCache));
        }
        if (col > 0 && matrix[row][col - 1] > value) {
            max = Math.max(max, 1 + getMaxLength(matrix, row, col - 1, maxLengthCache));
        }
        if (col < cols - 1 && matrix[row][col + 1] > value) {
            max = Math.max(max, 1 + getMaxLength(matrix, row, col + 1, maxLengthCache));
        }
        maxLengthCache.put(cacheIndex, max);
        return max;
    }
}
