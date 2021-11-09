package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BINARY_SEARCH)
@BeatsPercent(100)
@TimeComplexity(Complexity.LOGARITHMIC_N) // where N is the number of elements in matrix
@SpaceComplexity(Complexity.CONSTANT)
public class Problem74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        int cols = matrix[0].length;
        int hi = matrix.length*cols - 1;
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            int row = mid / cols;
            int col = mid % cols;
            int diff = target - matrix[row][col];
            if (diff == 0) {
                return true;
            }
            if (diff > 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }
}
