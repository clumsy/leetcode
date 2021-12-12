package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] banks : accounts) {
            int wealth = 0;
            for (int bank : banks) {
                wealth += bank;
            }
            max = Math.max(max, wealth);
        }
        return max;
    }
}
