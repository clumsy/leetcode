package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.BIT_MANIPULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem136 {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for (int num : nums) {
            answer ^= num; // pairs cancel each other out
        }
        return answer;
    }
}
