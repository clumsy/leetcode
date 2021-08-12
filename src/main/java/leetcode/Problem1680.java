package leetcode;

@BeatsPercent(28.45)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1680 {
    private static final int MOD = 1_000_000_007;

    public int concatenatedBinary(int n) {
        int ans = 0;
        long exp = 1;
        while (n > 0) {
            ans += (n*exp) % MOD;
            ans %= MOD;
            exp *= (int) Math.pow(2, 1 + Math.floor(Math.log(n)/Math.log(2))) % MOD;
            exp %= MOD;
            n--;
        }
        return ans;
    }
}
