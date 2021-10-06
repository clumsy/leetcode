package leetcode;

@Difficulty(Level.EASY)
@BeatsPercent(58.98)
@Algorithms(Algorithm.MERGE_INTERVAL)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            ans += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }
        return ans + duration; // last attack always lasts _duration_ seconds
    }
}
