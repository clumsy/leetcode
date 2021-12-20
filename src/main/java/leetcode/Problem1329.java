package leetcode;

import java.util.Arrays;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.COUNTING_SORT)
@BeatsPercent(91.67)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1329 {
    private static final int MAX = 100;

    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] count = new int[MAX + 1];
        for (int c = cols - 1; c >= 0; --c) {
            Arrays.fill(count, 0);
            for (int i = 0, j = c; i < rows && j < cols; ++i, ++j) {
                ++count[mat[i][j]];
            }
            for (int k = 0, i = 0, j = c; k < count.length; ++k) {
                while (count[k]-- > 0) {
                    mat[i++][j++] = k;
                }
            }
        }
        for (int r = 1; r < rows; ++r) {
            Arrays.fill(count, 0);
            for (int i = r, j = 0; i < rows && j < cols; ++i, ++j) {
                ++count[mat[i][j]];
            }
            for (int k = 0, i = r, j = 0; k < count.length; ++k) {
                while (count[k]-- > 0) {
                    mat[i++][j++] = k;
                }
            }
        }
        return mat;
    }
}
