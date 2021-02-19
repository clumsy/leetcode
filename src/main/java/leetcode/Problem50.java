package leetcode;

@Beats100Percent
public class Problem50 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == 2) {
            return x*x;
        }
        if (n == 3) {
            return x*x*x;
        }
        if (n < 0 && n > Integer.MIN_VALUE) {
            return myPow(1/x, -n);
        }
        double fourth = myPow(x*x, n/4);
        return myPow(x, n%4)*fourth*fourth;
    }
}
