package leetcode;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1886 {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean rotate_90  = true;
        boolean rotate_180 = true;
        boolean rotate_270 = true;
        boolean rotate_360 = true;
        for (int r = 0, rs = mat.length; r < rs; r++) {
            for (int c = 0, cs = mat[0].length; c < cs; c++) {
                rotate_90  &= mat[c         ][rs - 1 - r] == target[r][c];
                rotate_180 &= mat[rs - 1 - r][cs - 1 - c] == target[r][c];
                rotate_270 &= mat[cs - 1 - c][r         ] == target[r][c];
                rotate_360 &= mat[r         ][c         ] == target[r][c];
                if (!rotate_90 && !rotate_180 && !rotate_270 && !rotate_360) {
                    return false;
                }
            }
        }
        return true;
    }
}
