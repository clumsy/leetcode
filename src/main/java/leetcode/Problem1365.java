package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.FREQUENCY_COUNT)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1365 {
    private static final int MAX = 100;

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[MAX + 2];
        for (int num : nums) {
            ++count[num];
        }
        for (int i = 1; i <= MAX; ++i) {
            count[i] += count[i - 1];
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            answer[i] = nums[i] > 0 ? count[nums[i] - 1] : 0;
        }
        return answer;
    }
}
