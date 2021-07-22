package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.CONSTANT)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1227 {
    public double nthPersonGetsNthSeat(int n) {
        if (n == 1) {
            return 1;
        }
        return 0.5;
//        double[] dp = new double[n];
//        dp[0] = 1;
//        dp[1] = 0.5;
//        for (int i = 2; i < n; i++) {
//            dp[i] = 1./n;
//            for (int j = 1; j < i; j++) {
//                dp[i] += dp[j]/n;
//            }
//        }
//        return dp[n - 1];
    }
}
