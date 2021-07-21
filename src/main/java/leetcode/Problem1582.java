package leetcode;

@BeatsPercent(98.98)
@TimeComplexity(Complexity.N_BY_M)
@SpaceComplexity(Complexity.N_PLUS_M)
public class Problem1582 {
    public int numSpecial(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] special_rows = new int[rows];
        int[] special_cols = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    special_rows[i]++;
                    special_cols[j]++;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1 && special_rows[i] == 1 && special_cols[j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
