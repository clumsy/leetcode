package leetcode;

@Beats100Percent
public class Problem70 {
    public int climbStairs(int n) {
        double phi = Math.sqrt(5);
        double result = (Math.pow((1 + phi)/2, n + 1) - Math.pow((1 - phi)/2, n + 1))/phi;
        return (int) result;
    }
}
