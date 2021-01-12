package leetcode;

public class Problem695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0, rows = grid.length; i < rows; i++) {
            for (int j = 0, cols = grid[0].length; j < cols; j++) {
                int candidate = maxAreaStarting(grid, i, j);
                max = Math.max(max, candidate);
            }
        }
        return max;
    }

    private int maxAreaStarting(int[][] grid, int row, int col) {
        if (grid[row][col] == 0) {
            return 0;
        }
        grid[row][col] = 0;
        int left = 0;
        if (col > 0) {
            left = maxAreaStarting(grid, row, col - 1);
        }
        int up = 0;
        if (row > 0) {
            up = maxAreaStarting(grid, row - 1, col);
        }
        int right = 0;
        if (col < grid[0].length - 1) {
            right = maxAreaStarting(grid, row, col + 1);
        }
        int down = 0;
        if (row < grid.length - 1) {
            down = maxAreaStarting(grid, row + 1, col);
        }
        return 1 + left + right + up + down;
    }
}
