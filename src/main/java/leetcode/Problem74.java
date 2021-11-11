package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BINARY_SEARCH)
@BeatsPercent(100)
@TimeComplexity(Complexity.LOGARITHMIC_N) // where N is the number of elements in matrix
@SpaceComplexity(Complexity.CONSTANT)
public class Problem74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int lo = 0;
        int hi = n*m - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            int val = matrix[mid / m][mid % m];
            if (val == target) {
                return true;
            }
            if (val > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false;
    }
}
