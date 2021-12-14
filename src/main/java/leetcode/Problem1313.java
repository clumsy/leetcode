package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(89.46)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1313 {
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            length += nums[i]; // freq
        }
        int[] list = new int[length];
        for (int i = 0, k = 0; i < nums.length; i += 2) {
            for (int freq = 0; freq < nums[i]; ++freq) {
                list[k++] = nums[i + 1];
            }
        }
        return list;
    }
}
