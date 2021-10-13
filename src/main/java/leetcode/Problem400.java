package leetcode;

@Difficulty(Level.MEDIUM)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LOGARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem400 {
    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        long count = 9;
        int start = 1;
        int digits = 1;
        while (n > count*digits) {
            n -= count*digits;
            start *= 10;
            count *= 10;
            digits++;
        }
        int p = start + (n - 1)/digits;
        int t = (n - 1)%digits;
        while (++t < digits) {
            p /= 10;
        }
        return p % 10;
    }
}
