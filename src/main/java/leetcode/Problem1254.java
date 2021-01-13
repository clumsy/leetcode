package leetcode;

public class Problem1254 {
    public int closedIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (rows < 3 || cols < 3) {
            return 0;
        }
        int islandCount = 0;
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (isClosedIsland(grid, i, j)) {
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    private boolean isClosedIsland(int[][] grid, int row, int col) {
        if (grid[row][col] == 1) {
            return false;
        }
        grid[row][col] = 1;

        int rows = grid.length;
        int cols = grid[0].length;
        boolean result = true;

        if (col == 0) {
            result = false;
        } else if (grid[row][col - 1] == 0 && !isClosedIsland(grid, row, col - 1)) {
            result = false;
        }

        if (col == cols - 1) {
            result = false;
        } else if (grid[row][col + 1] == 0 && !isClosedIsland(grid, row, col + 1)) {
            result = false;
        }

        if (row == 0) {
            result = false;
        } else if (grid[row - 1][col] == 0 && !isClosedIsland(grid, row - 1, col)) {
            result = false;
        }

        if (row == rows - 1) {
            result = false;
        } else if (grid[row + 1][col] == 0 && !isClosedIsland(grid, row + 1, col)) {
            result = false;
        }

        return result;
    }
}
