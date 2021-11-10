package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if (r*c != n*m) {
            return mat;
        }
        int[][] result = new int[r][c];
        for (int i = 0, size = n*m; i < size; i++) {
            result[i / c][i % c] = mat[i / m][i % m];
        }
        return result;
    }
}
