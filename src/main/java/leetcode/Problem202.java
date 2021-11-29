package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.FLOYD_CYCLE_DETECTION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N) // ?
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem202 {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while (true) {
            slow = sum(slow);
            fast = sum(sum(fast));
            if (fast == 1) {
                return true;
            }
            if (slow == fast) {
                return false;
            }
        }
    }
    
    private int sum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
