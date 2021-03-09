package leetcode;

@BeatsPercent(95.27)
@TimeComplexity(Complexity.N_BY_M)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1277 {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] +=
                            Math.min(i + 1 < m ? matrix[i + 1][j] : 0,
                                    Math.min(j + 1 < n ? matrix[i][j + 1] : 0,
                                            (i + 1 < m) && (j + 1 < n) ? matrix[i + 1][j + 1] : 0));
                    count += matrix[i][j];
                }
            }
        }
        return count;
    }

//    public int countSquares(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int count = 0;
//        for (int i = 0; i < m; i++) {
//            next: for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == 1) {
//                    count++; // square of size one
//                    for (int k = 1; i + k < m && j + k < n; k++) {
//                        for (int h = 0; h <= k; h++) {
//                            if (matrix[i + k][j + h] != 1 || matrix[i + h][j + k] != 1) {
//                                continue next;
//                            }
//                        }
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;
//    }
}
