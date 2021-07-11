package leetcode;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1025 {
    public boolean divisorGame(int n) {
        if (n <= 1) {
            return false;
        }
        boolean[] loses = new boolean[n + 1];
        loses[0] = true;
        loses[1] = true;
        return solve(n, loses);
    }

    private boolean solve(int n, boolean[] loses) {
        if (loses[n]) {
            return false;
        }
        for (int x = 1, max = (int) Math.sqrt(n); x <= max; x++) {
            if (n % x == 0 && !solve(n - x, loses)) {
                return true;
            }
        }
        loses[n] = true;
        return false;
    }
}
