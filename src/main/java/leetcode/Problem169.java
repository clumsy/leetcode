package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.BOYER_MOORE_MAJORITY_VOTING)
@BeatsPercent(99.90)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = -1;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += num == candidate ? 1 : -1;
        }
        return candidate;
    }
}
