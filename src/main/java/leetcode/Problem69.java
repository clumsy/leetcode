package leetcode;

public class Problem69 {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        return (int) mySqrt(x, 2, x/2);
    }

    private long mySqrt(long x, long lo, long hi) {
        if (lo > hi) {
            return hi;
        }
        long mid = (lo + hi) / 2;
        if (mid * mid > x) {
            return mySqrt(x, lo, mid - 1);
        }
        return mySqrt(x, mid + 1, hi);
    }
}
