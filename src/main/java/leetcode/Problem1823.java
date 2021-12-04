package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.JOSEPHUS_PROBLEM)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1823 {
    public int findTheWinner(int n, int k) {
        int winner = 0;
        for (int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1; // 1-indexed input
    }
}
