package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BIT_MANIPULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1829 {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int mask = (1 << maximumBit) - 1;
        int[] answer = new int[nums.length];
        int xor = 0;
        for (int i = 0; i < nums.length; ++i) {
            xor ^= nums[i];
            answer[nums.length - i - 1] = ~xor & mask;
        }
        return answer;
    }
}
