package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LOGARITHMIC_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1201 {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long left = Math.min(a, Math.min(b, c));
        long right = (long) 1e18;
        long ab = lcm(a, b);
        long bc = lcm(b, c);
        long ac = lcm(a, c);
        long abc = lcm(a, bc);
        while (left < right) {
            long num = left + (right - left)/2;
            long count = num/a + num/b + num/c - num/ab - num/bc - num/ac + num/abc;
            if (count >= n) {
                right = num;
            } else {
                left = num + 1;
            }
        }
        return (int) left;
    }

    private static long lcm(long x, long y) {
        return (x/gcd(x, y))*y;
    }

    private static long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x%y);
    }
}
