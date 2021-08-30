package leetcode;

@BeatsPercent(100)
@Algorithms(Algorithm.PREFIX_SUM)
@TimeComplexity(Complexity.N_BY_M)
@SpaceComplexity(Complexity.N_BY_M)
public class Problem289 {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] sum = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] =
                    (i > 0 ? sum[i - 1][j] : 0) +
                    (j > 0 ? sum[i][j - 1] : 0) -
                    (i > 0 && j > 0 ? sum[i - 1][j - 1] : 0) +
                    board[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int neighbors =
                    sum[Math.min(i + 1, n - 1)][Math.min(j + 1, m - 1)] -
                    (i > 1 ? sum[i - 2][Math.min(j + 1, m - 1)] : 0) -
                    (j > 1 ? sum[Math.min(i + 1, n - 1)][j - 2] : 0) +
                    (i > 1 && j > 1 ? sum[i - 2][j - 2] : 0) -
                    board[i][j]; // not counting self
                if (board[i][j] == 1) {
                    if (neighbors < 2 || neighbors > 3) { // 1. and // 3.
                        board[i][j] = 0;
                    }
                } else if (neighbors == 3) { // 4.
                    board[i][j] = 1;
                }
            }
        }
    }
}
