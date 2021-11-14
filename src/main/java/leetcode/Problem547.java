package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(100)
@TimeComplexity(Complexity.QUADRATIC_N)
@SpaceComplexity(Complexity.LINEAR_N) // stack frame depth
public class Problem547 {
    public int findCircleNum(int[][] isConnected) {
        int ans = 0;
        int n = isConnected.length;
        for (int i = 0; i < n; i++) {
            if (isConnected[i][i] == 1) { // not visited
                dfs(isConnected, i);
                ans++;
            }
        }
        return ans;
    }

    private void dfs(int[][] isConnected, int i) {
        isConnected[i][i] = 0;
        int n = isConnected.length;
        for (int j = 0; j < n; j++) {
            if (isConnected[j][j] == 1 && isConnected[i][j] == 1) {
                dfs(isConnected, j);
            }
        }
    }
}
