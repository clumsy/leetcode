package leetcode;

@BeatsPercent(100)
public class Problem172 {
    public int trailingZeroes(int n) {
        int zeroes = 0;
        for (int i = 5; i <= n; i *= 5) {
            zeroes += n/i;
        }
        return zeroes;
    }
}
