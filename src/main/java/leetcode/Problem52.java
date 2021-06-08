package leetcode;

@BeatsPercent(65.46)
@TimeComplexity(Complexity.FACTORIAL_N) // NOTE: there's closed formula
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem52 {
    public int totalNQueens(int n) {
        boolean[] cols   = new boolean[n];
        boolean[] diag_1 = new boolean[2*n];
        boolean[] diag_2 = new boolean[2*n];
        return addLevel(n, 0, cols, diag_1, diag_2);
    }

    private int addLevel(int n, int row, boolean[] cols, boolean[] diag_1, boolean[] diag_2) {
        if (row == n) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < n; col++) {
            int d_1 = n - 1 + col - row;
            int d_2 = row + col;
            if (cols[col] || diag_1[d_1] || diag_2[d_2]) {
                continue;
            }
            cols[col] = true;
            diag_1[d_1] = true;
            diag_2[d_2] = true;
            count += addLevel(n, row + 1, cols, diag_1, diag_2);
            diag_1[d_1] = false;
            diag_2[d_2] = false;
            cols[col] = false;
        }
        return count;
    }
}
