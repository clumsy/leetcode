package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@BeatsPercent(67.46)
@TimeComplexity(Complexity.N_BY_M)
@SpaceComplexity(Complexity.N_BY_M)
public class Problem1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] row_mins = new int[rows];
        Arrays.fill(row_mins, Integer.MAX_VALUE);
        int[] col_maxs = new int[cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                row_mins[row] = Math.min(row_mins[row], matrix[row][col]);
                col_maxs[col] = Math.max(col_maxs[col], matrix[row][col]);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                if (row_mins[row] == col_maxs[col]) {
                    result.add(row_mins[row]);
                }
            }
        }
        return result;
    }
}
