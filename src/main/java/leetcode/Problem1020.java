package leetcode;

public class Problem1020 {
    public int numEnclaves(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        for (int row = 0, lastCol = cols - 1; row < rows; row++) {
            if (A[row][0] == 1) {
                traverse(A, row, 0);
            }
            if (A[row][lastCol] == 1) {
                traverse(A, row, lastCol);
            }
        }
        for (int col = 0, lastRow = rows - 1; col < cols; col++) {
            if (A[0][col] == 1) {
                traverse(A, 0, col);
            }
            if (A[lastRow][col] == 1) {
                traverse(A, lastRow, col);
            }
        }
        int count = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (A[row][col] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private void traverse(int[][] grid, int row, int col) {
        grid[row][col] = 0;
        if (row > 0 && grid[row - 1][col] == 1) {
            traverse(grid, row - 1, col);
        }
        if (col > 0 && grid[row][col - 1] == 1) {
            traverse(grid, row, col - 1);
        }
        if (row < grid.length - 1 && grid[row + 1][col] == 1) {
            traverse(grid, row + 1, col);
        }
        if (col < grid[0].length - 1 && grid[row][col + 1] == 1) {
            traverse(grid, row, col + 1);
        }
    }
}
