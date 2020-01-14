package leetcode;

public class Problem201 {
    public static final class Alternative extends Problem201 {

        @Override
        public int rangeBitwiseAnd(int m, int n) {
            if (m == n) {
                return m;
            }
            int mask = -1 << log2(n - m) + 1;
            return m & n & mask;
        }

        public static int log2(int n){
            if (n <= 0) {
                throw new IllegalArgumentException();
            }
            return 31 - Integer.numberOfLeadingZeros(n);
        }
    }

    public int rangeBitwiseAnd(int m, int n) {
        int result = 0;
        int mask = 1;
        while (mask <= n) {
            if ((m & mask) != 0 && (m + mask > n || m + mask < 0)) {
                result |= mask;
            }
            if (mask < 0) {
                break;
            }
            m &= ~mask;
            mask <<= 1;
        }
        return result;
    }
}
