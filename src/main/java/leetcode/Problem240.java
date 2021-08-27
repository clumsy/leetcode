package leetcode;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.N_PLUS_M) // where N is the number of rows, M is the number of cols
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int row = 0;
        int col = matrix[0].length - 1;
        while (col >= 0 && row < n) {
            int diff = matrix[row][col] - target;
            if (diff == 0) {
                return true;
            }
            if (diff > 0) {
                col--; // eliminating col
            } else {
                row++; // eliminating row
            }
        }
        return false;
    }
}
