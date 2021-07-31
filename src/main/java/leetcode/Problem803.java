package leetcode;

@BeatsPercent(77.98)
@TimeComplexity(Complexity.N_BY_M)
@SpaceComplexity(Complexity.N_BY_M)
public class Problem803 {
    public int[] hitBricks(int[][] grid, int[][] hits) {
        int cols = grid[0].length;

        // erasing bricks that were hit
        for (int[] hit : hits) {
            int row = hit[0];
            int col = hit[1];
            if (grid[row][col] == 1) {
                grid[row][col] = -1; // brick was hit
            }
        }

        // marking bricks that never fell
        for (int col = 0; col < cols; col++) {
            if (grid[0][col] == 1) {
                dfs(grid, 0, col);
            }
        }

        // bringing bricks back in reverse
        int h = hits.length;
        int[] result = new int[h];
        for (int i = h - 1; i >= 0; i--) {
            int row = hits[i][0];
            int col = hits[i][1];
            if (grid[row][col] == -1) { // was hit
                grid[row][col] = 1;
                if (is_neighbor_stable(grid, row, col)) {
                    int fell = dfs(grid, row, col);
                    result[i] = Math.max(fell - 1, 0); // not counting the brick that was hit
                }
            }
        }
        return result;
    }
    
    private boolean is_neighbor_stable(int[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (row < 0 || col < 0 || row >= rows || col >= cols) {
            return false;
        }
        if (row == 0) {
            return true; // first row is always stable
        }
        return
            is_stable(grid, row - 1, col) ||
            is_stable(grid, row, col - 1) ||
            is_stable(grid, row + 1, col) ||
            is_stable(grid, row, col + 1);
    }

    private boolean is_stable(int[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (row < 0 || col < 0 || row >= rows || col >= cols) {
            return false;
        }
        return grid[row][col] == 2;
    }

    private int dfs(int[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] != 1) {
            return 0;
        }
        grid[row][col] = 2; // stable
        int count = 1;
        count += dfs(grid, row - 1, col);
        count += dfs(grid, row, col - 1);
        count += dfs(grid, row + 1, col);
        count += dfs(grid, row, col + 1);
        return count;
    }
}
