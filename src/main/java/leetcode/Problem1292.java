package leetcode;

@BeatsPercent(84.59)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1292 {
    public int maxSideLength(int[][] mat, int threshold) {
        int max_length = 0;
        for (int r = 0, rs = mat.length; r < rs; r++) {
            for (int c = 0, cs = mat[0].length; c < cs; c++) {
                mat[r][c] +=
                    (r > 0 ? mat[r - 1][c] : 0) +
                    (c > 0 ? mat[r][c - 1] : 0) -
                    (r > 0 && c > 0 ? mat[r - 1][c - 1] : 0);
                if (r - max_length >= 0 && c - max_length >= 0) {
                    int sum =
                        mat[r][c] -
                        (r - max_length > 0 ? mat[r - max_length - 1][c                 ] : 0) -
                        (c - max_length > 0 ? mat[r                 ][c - max_length - 1] : 0) +
                        (r - max_length > 0 && c - max_length > 0 ? mat[r - max_length - 1][c - max_length - 1] : 0);
                    if (sum <= threshold) {
                        max_length++;
                    }
                }
            }
        }
        return max_length;
    }
}
