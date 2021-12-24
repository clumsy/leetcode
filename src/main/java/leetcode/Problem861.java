package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BIT_MANIPULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem861 {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // we toggle all rows to have a leading 1 (since it makes the number largest no matter what)
        // so the sum is made of at least m 1^(n-1) numbers
        int sum = (1 << (n - 1)) * m;
        for (int c = 1; c < n; ++c) {
            int ones = 0;
            for (int[] row : grid) {
                // count the number of 1 bits taking initial toggling into account
                // remember we toggled only if leading digit was 0
                ones += row[c] == row[0] ? 1 : 0;
            }
            // we will toggle only if we get more ones this way, hence adding max 1^(n-c-1) numbers
            sum += Math.max(ones, m - ones)*(1 << (n - c - 1));
        }
        return sum;
    }
}
