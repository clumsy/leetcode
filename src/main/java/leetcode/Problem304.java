package leetcode;

@BeatsPercent(70.74)
@TimeComplexity(Complexity.N_BY_M)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem304 {
    class NumMatrix {
        private int[][] sums;

        public NumMatrix(int[][] matrix) {
            this.sums = matrix;
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    int A = row > 0 && col > 0 ? sums[row - 1][col - 1] : 0;
                    int B = row > 0 ? sums[row - 1][col] : 0;
                    int C = col > 0 ? sums[row][col - 1] : 0;
                    sums[row][col] += B + C - A;
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int A = row1 > 0 && col1 > 0 ? sums[row1 - 1][col1 - 1] : 0;
            int B = row1 > 0 ? sums[row1 - 1][col2] : 0;
            int C = col1 > 0 ? sums[row2][col1 - 1] : 0;
            return sums[row2][col2] - B - C + A;
        }
    }
}
