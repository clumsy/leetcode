package leetcode;

public class Problem200 {
    public int numIslands(char[][] grid) {
        int islandCount = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '0') {
                    continue;
                }
                islandCount++;
                markIsland(grid, row, col);
            }
        }
        return islandCount;
    }

    private void markIsland(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 ||
                row >= grid.length || col >= grid[0].length ||
                grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';
        markIsland(grid, row - 1, col);
        markIsland(grid, row + 1, col);
        markIsland(grid, row, col + 1);
        markIsland(grid, row, col - 1);
    }
}
