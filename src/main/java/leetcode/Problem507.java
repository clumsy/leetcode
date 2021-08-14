package leetcode;

@BeatsPercent(96.15)
@TimeComplexity(worst = Complexity.SQRT_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem507 {
    public boolean checkPerfectNumber(int num) {
        if (num < 2) {
            return false;
        }
        int sum = 1; // 1 divides anything
        for (int i = 2, max = (int) Math.sqrt(num); i <= max; i++) {
            if (sum > num) {
                return false;
            }
            if (num % i == 0) {
                sum += i;
                int div = num/i;
                if (div > max) {
                    sum += div;
                }
            }
        }
        return sum == num;
    }
}
