package leetcode;

@BeatsPercent(52.71)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem808 {
    public double soupServings(int n) {
        if (n > 4800) {
            return 1;
        }
        int units = (int) Math.ceil(n/25.);
        double[][] dp = new double[200][200];
        return dfs(units, units, dp);
    }
    
    private static double dfs(int a, int b, double[][] dp) {
        if (a <= 0 && b <= 0) {
            return 0.5;
        } else if (a <= 0) {
            return 1;
        } else if (b <= 0) {
            return 0;
        }
        if (dp[a][b] > 0) {
            return dp[a][b];
        }
        dp[a][b] = 0.25*(
            dfs(a - 4, b, dp) + 
            dfs(a - 3, b - 1, dp) + 
            dfs(a - 2, b - 2, dp) + 
            dfs(a - 1, b - 3, dp));
        return dp[a][b];
    }
}
