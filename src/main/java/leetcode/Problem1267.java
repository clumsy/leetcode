package leetcode;

@BeatsPercent(96.77)
@TimeComplexity(Complexity.N_BY_M)
@SpaceComplexity(Complexity.LINEAR_K) // where K = max(N,M)
public class Problem1267 {
    public int countServers(int[][] grid) {
        int rows = grid.length;
        int[] row_count = new int[rows];
        int cols = grid[0].length;
        int[] col_count = new int[cols];
        int total = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1) {
                    total++;
                    row_count[row]++;
                    col_count[col]++;
                }
            }
        }
        int isolated = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1 && row_count[row] < 2 && col_count[col] < 2) {
                    isolated++;
                }
            }
        }
        return total - isolated;
    }
}
