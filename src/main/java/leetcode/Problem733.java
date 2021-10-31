package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(65.07)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] != newColor) {
            dfs(image, sr, sc, image[sr][sc], newColor);
        }
        return image;
    }

    private void dfs(int[][] a, int r, int c, int oc, int nc) {
        if (r < 0 || r >= a.length || c < 0 || c >= a[0].length || a[r][c] != oc) {
            return;
        }
        a[r][c] = nc;
        dfs(a, r - 1, c, oc, nc);
        dfs(a, r + 1, c, oc, nc);
        dfs(a, r, c - 1, oc, nc);
        dfs(a, r, c + 1, oc, nc);
    }
}
