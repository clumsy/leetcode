package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.LEFT_TO_RIGHT_RIGHT_TO_LEFT)
@BeatsPercent(98.72)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1769 {
    public int[] minOperations(String boxes) {
        char[] s = boxes.toCharArray();
        int[] ans = new int[s.length];
        for (int i = 0, operations = 0, count = 0; i < s.length; ++i) {
            ans[i] += operations;
            count += s[i] == '1' ? 1 : 0;
            operations += count;
        }
        for (int i = s.length - 1, operations = 0, count = 0; i >= 0; --i) {
            ans[i] += operations;
            count += s[i] == '1' ? 1 : 0;
            operations += count;
        }
        return ans;
    }
}
