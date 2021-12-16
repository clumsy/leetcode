package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.FREQUENCY_COUNT)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1512 {
    private static final int MAX = 100;

    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[MAX + 1];
        int answer = 0;
        for (int num : nums) {
            answer += count[num]++;
        }
        return answer;
    }
}
