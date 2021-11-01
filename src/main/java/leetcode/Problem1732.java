package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1732 {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int g : gain) {
            current += g;
            max = Math.max(max, current);
        }
        return max;
    }
}
