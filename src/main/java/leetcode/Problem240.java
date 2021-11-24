package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.ELIMINATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.N_PLUS_M) // where M is the number of rows, N is the number of cols
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            int diff = matrix[r][c] - target;
            if (diff == 0) {
                return true;
            }
            if (diff > 0) {
                c--; // cannot be in column c
            } else {
                r++; // cannot be in row r
            }
        }
        return false;
    }
}
