package leetcode;

public class Problem48 {
    public void rotate(int[][] matrix) {
        int length = matrix.length - 1;
        for (int i = 0, iMax = (matrix.length + 1)/2; i < iMax; ++i) {
            for (int j = i, jMax = length - i; j < jMax; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[length - j][i];
                matrix[length - j][i] = matrix[length - i][length - j];
                matrix[length - i][length - j] = matrix[j][length - i];
                matrix[j][length - i] = tmp;
            }
        }
    }
}
