package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.MATH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_K) // where K = min(N, M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem62 {
    public int uniquePaths(int m, int n) {
        int total_moves = m + n - 2;
        int down_moves = m - 1;
        int right_moves = n - 1;
        double result = 1;
        // calculating total_moves!/(down_moves!*right_moves!)
        for (int move = 1, moves = Math.min(down_moves, right_moves); move <= moves; move++) {
            result = (result * total_moves--)/move;
        }
        return (int) result;
    }
}
