package problems1_99.problem7;

public class Problem7 {
    public static int reverse(int x) {
        int result = 0, sign = x > 0 ? 1 : -1;
        x = Math.abs(x);
        while (x > 0) {
            try {
                result = Math.addExact(Math.multiplyExact(result, 10), x % 10);
            } catch (ArithmeticException e) {
                return 0;
            }
            x /= 10;
        }
        return sign*result;
    }
}
