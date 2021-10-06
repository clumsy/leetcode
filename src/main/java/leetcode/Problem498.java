package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(52.17)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[n*m];
        for (int i = 0, r = 0, c = 0; i < ans.length; i++) {
            ans[i] = mat[r][c];
            if ((r + c) % 2 == 0) { // when moving up this sum is odd
                if (c == m - 1) { // last column, go down
                    r++;
                } else if (r == 0) { // first row, go right
                    c++;
                } else {
                    r--;
                    c++;
                }
            } else { // when moving down this sum is even
                if (r == n - 1) { // last row, go right
                    c++;
                } else if (c == 0) { // first col, go down
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return ans;
    }
}
